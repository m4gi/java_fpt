/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.strut2;

import java.util.List;
import sample.registration.RegistrationDAO;
import sample.registration.RegistrationDTO;

/**
 *
 * @author Lucas
 */
public class SearchLikeLastnameAction {

    private String searchValue;
    private List<RegistrationDTO> listAccounts;
    private final String SUCCESS = "success";

    public SearchLikeLastnameAction() {
    }

    public String execute() throws Exception {
        RegistrationDAO dao = new RegistrationDAO();

        dao.searchLastName(searchValue);
        listAccounts = dao.getListAccounts();
        
        return SUCCESS;
    }

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    public List<RegistrationDTO> getListAccounts() {
        return listAccounts;
    }

    public void setListAccounts(List<RegistrationDTO> listAccounts) {
        this.listAccounts = listAccounts;
    }

}
