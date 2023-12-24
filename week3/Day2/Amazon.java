package week3.Day2;

public class Amazon extends Abstract_CanaraBank{

	

	public void cashOnDelivery() {
		System.out.println("Cash on delivery accepted");
		}

	public void upiPayments() {
		System.out.println("UPI accepted");
		}

	public void cardPayment() {
		System.out.println("Card payment accepted");
		}

	public void internetBanking() {
		System.out.println("Internet banking enabled");
		}

	@Override
	public void recordPaymentDetails() {
		System.out.println("payment details recorded");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	InterfacePayments intpay= new Amazon();
	
	intpay.cardPayment();
	intpay.cashOnDelivery();
	intpay.upiPayments();
	intpay.internetBanking();


}
}
