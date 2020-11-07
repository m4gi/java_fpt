/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Le Tuan
 */
public class Category {

    String catID, CatName;

    public Category() {
    }

    public Category(String catID, String CatName) {
        this.catID = catID;
        this.CatName = CatName;
    }

    public String getCatID() {
        return catID;
    }

    public String getCatName() {
        return CatName;
    }

}
