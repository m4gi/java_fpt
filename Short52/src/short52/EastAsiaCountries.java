/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short52;

import short52.Country;


public class EastAsiaCountries extends Country implements Comparable<EastAsiaCountries>{
    private String countryTerrain;

    public EastAsiaCountries() {
    }

    public EastAsiaCountries(String countryTerrain, String countryCode, String countryName, float totalArea) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public String toString() {
        return "------------------\n" + "CountryCode: " + countryCode + "\nCountryName: " + countryName + "\nTotalArea: " + totalArea  + "\nCountryTerrain: " + countryTerrain + "\n";
    }


    @Override
    public int compareTo(EastAsiaCountries t) {
        return countryName.compareTo(t.countryName);
    }
    

   
    
    
}
