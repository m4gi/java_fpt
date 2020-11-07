package Tour;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Tours implements ITour {
    Scanner sc = new Scanner(System.in);
    protected String code;
    protected String title;
    protected double price;
    protected String transport;
    protected Date startDate;
    protected Date endDate;

    // GETTER / SETTER------//
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {

        System.out.print("Enter the code:");
        code = sc.next();
        this.code = code;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {

        System.out.print("Enter the title:");
        title = sc.next();
        this.title = title;
    }

    public double getPrice() {
        System.out.print("Enter the title:");
        price = sc.nextDouble();
        return this.price;
    }

    public void setPrice(double price) {

        System.out.print("Enter the price:");
        price = sc.nextDouble();
        this.price = price;
    }

    public String getTransport() {
        return this.transport;
    }

    public void setTransport(String transport) {

        System.out.print("Enter the transport:");
        transport = sc.next();
        this.transport = transport;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        String s;
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyy");
        System.out.print("enter work start date:");
        s = sc.next();
        try {
            startDate = df.parse(s);
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
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyy");
        System.out.print("enter work end date:");
        s = sc.next();
        try {
            endDate = df.parse(s);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        this.endDate = endDate;
    }

    public long NumberOfYear() {
        return this.endDate.getTime() / 1000 / 60 / 60 / 24 / 365
                - this.startDate.getTime() / 1000 / 60 / 60 / 24 / 365;
    }

}
