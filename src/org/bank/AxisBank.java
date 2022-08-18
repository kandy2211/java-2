package org.bank;

public class AxisBank extends BankInfo {
@Override
public void savings() {
	System.out.println("75%");
}
private void fixed() {
System.out.println("53%");
}
@Override
public void deposit(int no) {
		System.out.println(no);
	}
public static void main(String[] args) {
	AxisBank a = new AxisBank();
	a.savings();
	a.fixed();
	a.deposit(55);

}
}
