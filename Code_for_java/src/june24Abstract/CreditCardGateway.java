package june24Abstract;


public class CreditCardGateway extends PaymentGateway {

	@Override
	public void processPayment() {
		System.out.println("processing payment by credit card");
	}

}
