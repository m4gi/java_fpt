package ass;

public class Domestic extends Tours {
	private double tip;

	public Domestic() {
	}

	public Domestic(double tip) {
		super();
		this.tip = tip;
	}

	public double getTip() {
		return tip;
	}

	public void setTip(double tip) {
		System.out.print("Enter guide tip:");
		tip = sc.nextDouble();
		this.tip = tip;
	}

	public Domestic input() {
		Domestic d = new Domestic();
		d.setCode(code);
		d.setTitle(title);
		d.setTransport(transport);
		d.setPrice(price);
		d.setStartDate(startDate);
		d.setEndDate(endDate);
		d.setTip(tip);
		return d;
	}

	@Override
	public String toString() {
		return "" + getCode() + "|" + getTitle() + "|" + getPrice() + "|" + getTransport() + "|" + getTip() + "|"
				+ tourCharge() + "|" + NumberOfYear();
	}

	public double surCharge() {
		return getTip() * NumberOfYear();
	}

	public double tourCharge() {
		return getPrice() + surCharge();
	}

}
