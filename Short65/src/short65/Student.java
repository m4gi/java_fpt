/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short65;

/**
 *
 * @author Magi
 */
public class Student {

    String SName;
    String SClasses;
    double SMaths;
    double SChemistry;
    double SPhysics;
    double average;
    char type;

    public Student() {
    }

    public Student(String SName, String SClasses, double SMaths, double SChemistry, double SPhysics) {
        this.SName = SName;
        this.SClasses = SClasses;
        this.SMaths = SMaths;
        this.SChemistry = SChemistry;
        this.SPhysics = SPhysics;
    }

    public Student(String SName, String SClasses, double SMaths, double SChemistry, double SPhysics, double average, char type) {
        this.SName = SName;
        this.SClasses = SClasses;
        this.SMaths = SMaths;
        this.SChemistry = SChemistry;
        this.SPhysics = SPhysics;
        this.average = average;
        this.type = type;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getSClasses() {
        return SClasses;
    }

    public void setSClasses(String SClasses) {
        this.SClasses = SClasses;
    }

    public double getSMaths() {
        return SMaths;
    }

    public void setSMaths(double SMaths) {
        this.SMaths = SMaths;
    }

    public double getSChemistry() {
        return SChemistry;
    }

    public void setSChemistry(double SChemistry) {
        this.SChemistry = SChemistry;
    }

    public double getSPhysics() {
        return SPhysics;
    }

    public void setSPhysics(double SPhysics) {
        this.SPhysics = SPhysics;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

}
