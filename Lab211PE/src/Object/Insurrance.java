/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author Magi
 */
public abstract class Insurrance {

    protected String IName;
    protected int ITime;
    protected double IMoney;

    public Insurrance(String IName, int ITime, double IMoney) {
        this.IName = IName;
        this.ITime = ITime;
        this.IMoney = IMoney;
    }

    public Insurrance() {
    }

    public String getIName() {
        return IName;
    }

    public void setIName(String IName) {
        this.IName = IName;
    }

    public int getITime() {
        return ITime;
    }

    public void setITime(int ITime) {
        this.ITime = ITime;
    }

    public double getIMoney() {
        return IMoney;
    }

    public void setIMoney(double IMoney) {
        this.IMoney = IMoney;
    }

    @Override
    public String toString() {
        return "Insurrance{" + "IName=" + IName + ", ITime=" + ITime + ", IMoney=" + IMoney + '}';
    }

    public abstract double Commission();
}
