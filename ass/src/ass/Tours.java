package ass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Tours implements ITour {
	protected String code,title,transport;
	protected  double price;
	protected  Date startDate,endDate;
	
	Scanner sc= new Scanner(System.in);
	
	public Tours() {}

	public Tours(String code, String title, String transport, double price, Date startDate, Date endDate) {
		super();
		this.code = code;
		this.title = title;
		this.transport = transport;
		this.price = price;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
    //GETTER / SETTER------//
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
    	
    	System.out.print("Enter the code:");
    	code=sc.next();
    	
        this.code = code;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
    	
    	System.out.print("Enter the title:");
    	title=sc.next();
    	
        this.title = title;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
    	
    	System.out.print("Enter the price:");
    	price=sc.nextInt();
    	
        this.price = price;
    }

    public String getTransport() {
        return this.transport;
    }

    public void setTransport(String transport) {
    	
    	System.out.print("Enter the transport:");
    	transport=sc.next();
    	
        this.transport = transport;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
		String s;
		SimpleDateFormat df= new SimpleDateFormat("dd-MM-yyy");
		System.out.print("enter work start date:");
		s=sc.next();
		try {
			startDate=df.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        this.startDate = startDate;
    }

    public Date getEndDate() {
    	
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
		String s;
		SimpleDateFormat df= new SimpleDateFormat("dd-MM-yyy");
		System.out.print("enter work end date:");
		s=sc.next();
		try {
			endDate=df.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        this.endDate = endDate;
    }
    
	public long NumberOfYear() {
		return this.endDate.getTime()/86400000
		-this.startDate.getTime()/86400000;
	}

	@Override
	public String toString() {
		return "Tours [getCode()=" + getCode() + ", getTitle()=" + getTitle() + ", getPrice()=" + getPrice()
				+ ", getTransport()=" + getTransport() + ", NumberOfYear()=" + NumberOfYear() + "]";
	}
	
	public abstract double surCharge();
	
	
}
