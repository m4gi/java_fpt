package Tour;

/**
 * domesticTours
 */

public class domesticTours extends Tours {
	protected double tip;

	// ---Getter/Setter---//
	public double getTip() {
		return this.tip;
	}

	public void setTip(double tip) {
		System.out.print("Enter the tip:");
		tip = sc.nextDouble();
		this.tip = tip;
	}

	public domesticTours input() {
		domesticTours dTour = new domesticTours();
		dTour.setCode(code);
		dTour.setTitle(title);
		dTour.setTransport(transport);
		dTour.setPrice(price);
		dTour.setStartDate(startDate);
		dTour.setEndDate(endDate);
		dTour.setTip(tip);
		return dTour;
	}

	// ------------------//
	public double tourCharge() {
		return (double) (getPrice() + getTip() * NumberOfYear());
	}

	@Override
	public String toString() {
		return "" + getCode() + "|" + getTitle() + "|" + getPrice() + "|" + getTransport() + "|" + NumberOfYear() + "|"
				+ getTip() + "|" + tourCharge();
	};

}