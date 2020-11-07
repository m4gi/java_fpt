package Controller;

import Model.ContactDB;
import Model.GroupDB;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;

/**
 *
 * @author Le Anh Tuan
 */
public class HomeController extends ActionSupport {

    private String url = null;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String log = null;

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String loadContent() {
        try {
            //Excute
            ContactController a = new ContactController();
            GroupController b = new GroupController();
            if (GroupController.groupList == null) {
                GroupDB groupDB = new GroupDB();
                GroupController.groupList = groupDB.selectAll();
            }
            if (ContactController.contactList == null) {
                ContactDB contactDB = new ContactDB();
                ContactController.contactList = contactDB.selectAll();
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            log = e.toString();
            return "failure";
        }
        //View
        return "success";
    }

}
