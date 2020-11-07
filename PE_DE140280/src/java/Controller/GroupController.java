package Controller;

import Model.ContactDB;
import Model.Group;
import Model.GroupDB;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Le Anh Tuan
 */
public class GroupController extends ActionSupport implements SessionAware {

    public static ArrayList<Group> groupList = null;
    private String url = null;
    private Map<String, Object> session;
    //FRONT_END
    private String name, description;
    private int id_group_delete;
    //LOG
    public static String log;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_group_delete() {
        return id_group_delete;
    }

    public void setId_group_delete(int id_group_delete) {
        this.id_group_delete = id_group_delete;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String viewGroup() {
        try {
            //Excute
            if (groupList == null) {
                GroupDB groupDB = new GroupDB();
                groupList = groupDB.selectAll();
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            log = e.toString();
            return "failure";
        }
        //View
        return "success";
    }

    public String deleteGroup() {
        try {
            //Excute
            GroupDB groupDB = new GroupDB();
            ContactDB contactDB = new ContactDB();
            contactDB.deleteByGroupId(id_group_delete);
            groupDB.delete(id_group_delete);
            //Update
            ContactController.contactList = contactDB.selectAll();
            groupList = groupDB.selectAll();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            log = e.toString();
            return "failure";
        }
        //View
        return "success";
    }

    public String addGroup() {
        try {
            //Init
            log = null;
            GroupDB groupDB = new GroupDB();
            //Validation
            Validation.checkString(name);
            Validation.checkString(description);
            //Excute
            groupDB.addNew(new Group(name, description));
            //Update list
            groupList = groupDB.selectAll();
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
