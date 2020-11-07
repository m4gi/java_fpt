package Model;

import Controller.GroupController;
import java.util.ArrayList;

public class Contact {

    private int id_contact;
    private String first_name;
    private String last_name;
    private int id_group;
    private String phone;
    //F_Key
    private String name;
    private String description;

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

    public Contact(String first_name, String last_name, int id_group, String phone) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.id_group = id_group;
        this.phone = phone;
    }

    public Contact(int id_contact, String first_name, String last_name, int id_group, String phone) {
        this.id_contact = id_contact;
        this.first_name = first_name;
        this.last_name = last_name;
        this.id_group = id_group;
        this.phone = phone;
        ArrayList<Group> a = GroupController.groupList;
        for (Group i : a) {
            if (i.getId_group() == this.id_group) {
                name = i.getName();
                description = i.getDescription();
                return;
            }
        }
    }

    public int getId_contact() {
        return id_contact;
    }

    public void setId_contact(int id_contact) {
        this.id_contact = id_contact;
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

    public int getId_group() {
        return id_group;
    }

    public void setId_group(int id_group) {
        this.id_group = id_group;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
