package com.qa.lab7;

public class ExchangeTransaction {

    private Customer customer;
    private Currency currency;
    private double gbpAmount;

    public ExchangeTransaction(Customer customer, Currency currency, double gbpAmount) {
        this.customer = customer;
        this.currency = currency;
        this.gbpAmount = gbpAmount;
    }

    public double calculateServiceFee() {

        return gbpAmount < 100 ? gbpAmount * 0.05 : gbpAmount * 0.025;
    }

    public double calculateTax(double amountAfterFee) {

        return customer.isVip() ? amountAfterFee * 0.05 : amountAfterFee * 0.10;
    }

    public void processTransaction() {

        double fee = calculateServiceFee();
        double amountAfterFee = gbpAmount - fee;
        
        double tax = calculateTax(amountAfterFee);
        double amountAfterTax = amountAfterFee - tax;

        double finalAmount = currency.convertToGBP(amountAfterTax);

        int rounded = (int) finalAmount;

        String receipt = String.format(
            "| Customer: %-10s | Amount: £%.2f | Fee: £%.2f | Tax: £%.2f | Final Amount: %d %s |",
            customer.getName(), gbpAmount, fee, tax, rounded, currency.getName()
        );

        System.out.println(receipt);
        TransactionLogger.log(receipt);
    }

}
