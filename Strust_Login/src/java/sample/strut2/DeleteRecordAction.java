/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.strut2;

import sample.registration.RegistrationDAO;

/**
 *
 * @author Lucas
 */
public class DeleteRecordAction {

    private String pk;
    private String lastSearchValue;
    private final String FAIL = "fail";
    private final String SUCCESS = "success";

    public DeleteRecordAction() {
    }

    public String execute() throws Exception {
        RegistrationDAO dao = new RegistrationDAO();
        boolean result = dao.deleteRecord(pk);
        String url = FAIL;
        if (result) {
            url = SUCCESS;

        }
        return url;
    }

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

    public String getLastSearchValue() {
        return lastSearchValue;
    }

    public void setLastSearchValue(String lastSearchValue) {
        this.lastSearchValue = lastSearchValue;
    }
    
}
