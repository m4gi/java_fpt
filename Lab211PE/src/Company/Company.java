/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Company;

import Object.*;
import Validation.Validation;
import java.util.ArrayList;

/**
 *
 * @author Magi
 */
public class Company {

    protected String EName;
    protected String Kind;
    ArrayList<Employee> ComList = new ArrayList<>();

    public Company() {
    }

    public Company(String EName, String Kind) {
        this.EName = EName;
        this.Kind = Kind;
    }

    public void addEmployee() {
    }
}
