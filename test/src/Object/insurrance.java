package Object;

public abstract class insurrance {

    String CustomerName;
    int amounth;
    double fee;

    public insurrance() {
    }

    public insurrance(String CustomerName, int amounth, double fee) {
        this.CustomerName = CustomerName;
        this.amounth = amounth;
        this.fee = fee;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public int getAmounth() {
        return amounth;
    }

    public void setAmounth(int amounth) {
        this.amounth = amounth;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "insurrance{" + "CustomerName=" + CustomerName + ", amounth=" + amounth + ", fee=" + fee + "}\n";
    }

    public abstract double Commission();

}
