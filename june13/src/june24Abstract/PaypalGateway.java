package june24Abstract;

public class PaypalGateway  extends PaymentGateway{

	@Override
	public void processPayment() {
		System.out.println("payment process by paypal");
		
	}
	
	public static void main(String[] args) {
		CreditCardGateway c = new CreditCardGateway();
		c.processPayment();
		PaypalGateway p = new PaypalGateway();
		p.processPayment();
		
	}

}
