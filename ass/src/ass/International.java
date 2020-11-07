package ass;

public class International extends Tours {
    protected double aviationTax;
    protected double entryFee;

    // ----Getter/Setter----//
    public double getAviationTax() {
        return this.aviationTax;
    }

    public void setAviationTax(double aviationTax) {
        System.out.print("Enter the aviation Tax: ");
        aviationTax = sc.nextDouble();
        this.aviationTax = aviationTax;
    }

    public double getEntryFee() {
        return this.entryFee;
    }

    public void setEntryFee(double entryFee) {
        System.out.print("Enter the entry Fee: ");
        entryFee = sc.nextDouble();
        this.entryFee = entryFee;
    }

    public double surCharge() {
        return getAviationTax() + getEntryFee();
    }
    // --------------------//

    public double tourCharge() {
        return getPrice() + surCharge();
    }

    @Override
    public String toString() {
        return "" + getCode() + "|" + getTitle() + "|" + getPrice() + "|" + getTransport() + "|" + NumberOfYear() + "|"
                + getAviationTax() + "|" + getEntryFee() + "|" + tourCharge();
    }

    public International input() {
        International iTour = new International();
        iTour.setCode(code);
        iTour.setTitle(title);
        iTour.setTransport(transport);
        iTour.setPrice(price);
        iTour.setStartDate(startDate);
        iTour.setEndDate(endDate);
        iTour.setAviationTax(aviationTax);
        iTour.setEntryFee(entryFee);
        return iTour;
    }
}
