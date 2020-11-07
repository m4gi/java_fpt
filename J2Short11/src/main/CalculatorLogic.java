package main;

public class CalculatorLogic {

    public CalculatorLogic() {

    }

    public boolean checkFormat(String[] num, String[] ope) throws Exception {
	if (num.length == 0 && ope.length == 0) throw new Exception("Empty!");
	for (String operators : ope) {
	    if (operators.length() > 1) throw new Exception("The input in wrong type!");
	}
	return true;
    }

    public String cal(String s) throws Exception {
	if (s.length() > 0 && s.charAt(0) == '-') s = "0" + s;
	String[] num = s.split("[-+/x]+");
	String[] operator = s.split("[0-9.]+");

	checkFormat(num, operator);
	boolean[] check = new boolean[num.length];

	for (int i = 1; i < num.length; i++) {
	    if (operator[i].equals("x")) {
		check[i] = true;
		int pos = i - 1;
		while (check[pos])
		    pos--;
		double numA = Double.parseDouble(num[pos]);
		double numB = Double.parseDouble(num[i]);
		num[pos] = Double.toString(numA * numB);
	    } else if (operator[i].equals("/")) {
		check[i] = true;
		int pos = i - 1;
		while (check[pos])
		    pos--;
		double numA = Double.parseDouble(num[pos]);
		double numB = Double.parseDouble(num[i]);
		num[pos] = Double.toString(numA / numB);
	    }
	}
	for (int i = 1; i < num.length; i++) {
	    if (check[i]) continue;
	    if (operator[i].equals("+")) {
		check[i] = true;
		int pos = i - 1;
		while (check[pos])
		    pos--;
		double numA = Double.parseDouble(num[pos]);
		double numB = Double.parseDouble(num[i]);
		num[pos] = Double.toString(numA + numB);
	    } else if (operator[i].equals("-")) {
		check[i] = true;
		int pos = i - 1;
		while (check[pos])
		    pos--;
		double numA = Double.parseDouble(num[pos]);
		double numB = Double.parseDouble(num[i]);
		num[pos] = Double.toString(numA - numB);
	    }
	}
	return num[0];
    }
}
