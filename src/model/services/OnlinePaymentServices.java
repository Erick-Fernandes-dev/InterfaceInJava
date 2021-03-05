package model.services;

public interface OnlinePaymentServices {
	
	public Double paymentFee(Double amount);
	public Double interest(Double amount, Integer months);

}
