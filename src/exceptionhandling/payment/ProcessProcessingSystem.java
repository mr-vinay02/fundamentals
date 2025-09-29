package exceptionhandling.payment;

public class ProcessProcessingSystem {

    private boolean paymentStatus;

    public void processPayment(String cardNumber , double amount ) throws InvalidPaymentDetailsException
    {

        // validate Card Number
        if( cardNumber == null || cardNumber.length() != 16){
            throw new InvalidPaymentDetailsException("Invalid card number! Must be 16 digits.");
        }

        if(amount <= 0){
            throw new InvalidPaymentDetailsException("Invalid amount! Payment must be greater than 0.");
        }

        boolean transactionSuccess = simulateTransaction();

        if(!transactionSuccess){
            throw new PaymentFailedException("Transaction failed due to network or bank error.");
        }

        paymentStatus = true;
        System.out.println("Payment of ₹" + amount + " processed successfully!");
    }

    // dummy simulations transaction
    private boolean simulateTransaction()
    {
        return Math.random() > 0.3;
    }

    public boolean getPaymentStatus() {
        return paymentStatus;
    }



}
