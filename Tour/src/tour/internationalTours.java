package Tour;

import java.util.Scanner;

public class internationalTours extends Tours {
    protected double aviationTax;
    protected double entryFee;
    Scanner sc = new Scanner(System.in);

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
    // --------------------//

    public double tourCharge() {
        return this.aviationTax + this.entryFee + this.price;
    }

    @Override
    public String toString() {
        return "internationalTours{" + "aviationTax=" + aviationTax + ", entryFee=" + entryFee + '}';
    }

    public internationalTours input() {
        internationalTours iTour = new internationalTours();
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