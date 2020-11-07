package controller;

import Model.Contact;
import Model.ContactDB;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
/**
 *
 * @author Hoang Chi Nhan
 */
public class ContactController extends ActionSupport implements SessionAware {

    public static ArrayList<Contact> contactList = null;
    private String url = null;
    private Map<String, Object> session;
    //FRONT-END LIST
    private String first_name, last_name, phone;
    private int id_group;
    private int id_contact_delete;
    //FRONT-END EDIT
    public static Contact selectedContact;
    private int id_contact_edit;
    //LOG
    public static String log;

    public int getId_contact_edit() {
        return id_contact_edit;
    }

    public void setId_contact_edit(int id_contact_edit) {
        this.id_contact_edit = id_contact_edit;
    }

    public int getId_group() {
        return id_group;
    }

    public void setId_group(int id_group) {
        this.id_group = id_group;
    }

    public int getId_contact_delete() {
        return id_contact_delete;
    }

    public void setId_contact_delete(int id_contact_delete) {
        this.id_contact_delete = id_contact_delete;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String viewContact() {
        try {
            //Excute
            if (contactList == null) {
                ContactDB contactDB = new ContactDB();
                contactList = contactDB.selectAll();
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            log = e.toString();
            return "failure";
        }
        //View
        return "success";
    }

    public String addContact() {
        try {
            //Init
            ContactDB contactDB = new ContactDB();
            //Validation
            Validation.checkString(first_name);
            Validation.checkString(last_name);
            Validation.checkString(phone);
            Validation.checkPhone(phone);
            //Excute
            contactDB.addNew(new Contact(first_name, last_name, id_group, phone));
            //Update list
            contactList = contactDB.selectAll();
        } catch (Exception e) {
            log = e.toString().replaceFirst("java.lang.Exception:", "");
            return "failure";
        }
        //View
        return "success";
    }

    public String deleteContact() {
        try {
            //Excute
            ContactDB contactDB = new ContactDB();
            contactDB.delete(id_contact_delete);
            //Update list
            contactList = contactDB.selectAll();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            log = e.toString().replaceFirst("java.lang.Exception:", "");
            return "failure";
        }
        //View
        return "success";
    }

    public String editContact() {
        try {
            //Init
            ContactDB contactDB = new ContactDB();
            //Validation
            Validation.checkString(first_name);
            Validation.checkString(last_name);
            Validation.checkString(phone);
            Validation.checkPhone(phone);
            //Excute
            selectedContact.setFirst_name(first_name);
            selectedContact.setLast_name(last_name);
            selectedContact.setId_group(id_group);
            selectedContact.setPhone(phone);
            contactDB.update(selectedContact);
            //Update list
            contactList = contactDB.selectAll();
        } catch (Exception e) {
            log = e.toString().replaceFirst("java.lang.Exception:", "");
            return "failure";
        }
        //View
        return "success";
    }

    public String getContact() {
        try {
            //Init
            ContactDB contactDB = new ContactDB();
            //Excute
            selectedContact = contactDB.getContactByID(id_contact_edit);
        } catch (Exception e) {
            log = e.toString().replaceFirst("java.lang.Exception:", "");
            return "failure";
        }
        //View
        return "success";
    }

    @Override
    public void setSession(Map<String, Object> map) {
        session = map;
    }
}
