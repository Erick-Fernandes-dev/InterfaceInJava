package model.services;

public class PaypalService implements OnlinePaymentServices {
	
	private static final double FEE_PERCENTAGE = 0.02;
	private static final double MONTHLY_INTEREST = 0.01;

	@Override
	public Double paymentFee(Double amount) {
		// TODO Auto-generated method stub
		return amount * FEE_PERCENTAGE;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		// TODO Auto-generated method stub
		return amount * MONTHLY_INTEREST * months;
	}

}
