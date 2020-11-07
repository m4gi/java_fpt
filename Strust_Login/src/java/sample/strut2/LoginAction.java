/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.strut2;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import sample.registration.RegistrationDAO;

/**
 *
 * @author Lucas
 */
public class LoginAction extends ActionSupport {

    private String username;
    private String password;
    private final String FAIL = "fail";
    private final String SUCCESS = "success";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginAction() {
    }

    public String execute() throws Exception {
        RegistrationDAO dao = new RegistrationDAO();
        boolean result = dao.checkLogin(username, password);

        String URL = FAIL;
        if (result) {
            Map session = ActionContext.getContext().getSession();
            session.put("USERNAME", getUsername());
            URL = SUCCESS;
        }
        return URL;
    }

    @Override
    public void validate() {
        if (this.username.length() == 0) {
            addFieldError("username", "Username is required");
        } else if (this.username.length() < 4) {
            addFieldError("username", "Username is very short");
        }
        if (this.password.length() == 0) {
            addFieldError("password", "Password is required");
        }
    }
}
