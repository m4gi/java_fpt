/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Magi
 */
class TransferManager extends Thread {

    CustomerAccount acc1;
    CustomerAccount acc2;
    double money;
    int count;

    public TransferManager(CustomerAccount acc1, CustomerAccount acc2, double money) {
        this.acc1 = acc1;
        this.acc2 = acc2;
        this.money = money;

    }

// thuc thi
    @Override
    public synchronized void run() {
        try {
            System.out.println("Account balance before transfer:");
            System.out.println(acc1.getAccountType() + ": " + acc1.getBlance());
            System.out.println(acc2.getAccountType() + ": " + acc2.getBlance());
            System.out.println("Total money to transfer: " + money);
            count = 0;
            while (acc1.getBlance() != acc2.getBlance()) {
                if (acc1.getBlance() < money) {
                    System.out.println("Not Enough Money");
                    break;
                } else {
                    System.out.println();

                    acc1.setBalance(acc1.getBlance() - money);
//                    System.out.println("sau khi chuyen tai khoan1 la \t " + acc1.getBlance());

                    Thread.sleep(500, 5);
                    
                    acc2.setBalance(acc2.getBlance() + money);
                    System.out.println("Transfering " + money + " usd from account " + acc1.getAccountType() + " to account " + acc2.getAccountType());
                    count++;
                }
            }
            System.out.println("Number of transfer instance: " + count);
            System.out.println("Account blance after transfer: ");
            System.out.println(acc1.getAccountType() + ": " + acc1.getBlance());
            System.out.println(acc2.getAccountType() + ": " + acc2.getBlance());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
