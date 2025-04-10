package org.example;

import java.util.Date;

public class CreditCardTransaction implements Transaction {
    private String transactionId;
    private String cardNumber;
    private double amount;
    private Date transactionDate;
    private boolean isCommitted;

    // Constructor
    public CreditCardTransaction(String transactionId, String cardNumber, double amount) {
        this.transactionId = transactionId;
        this.cardNumber = cardNumber;
        this.amount = amount;
        this.transactionDate = new Date();
        this.isCommitted = false;
    }

    @Override
    public void commit() {
        if (!isCommitted) {
            // Logic to process the payment
            // For example, interacting with a payment gateway API
            System.out.println("Processing payment of $" + amount + " for card " + maskCardNumber(cardNumber));
            // Assuming the payment is successful
            isCommitted = true;
            System.out.println("Transaction " + transactionId + " committed successfully.");
        } else {
            System.out.println("Transaction " + transactionId + " has already been committed.");
        }
    }

    @Override
    public void rollback() {
        if (isCommitted) {
            // Logic to reverse the payment
            // For example, interacting with a payment gateway API to refund
            System.out.println("Reversing payment of $" + amount + " for card " + maskCardNumber(cardNumber));
            // Assuming the reversal is successful
            isCommitted = false;
            System.out.println("Transaction " + transactionId + " rolled back successfully.");
        } else {
            System.out.println("Transaction " + transactionId + " has not been committed yet, so it cannot be rolled back.");
        }
    }

    // Utility method to mask the card number for security
    private String maskCardNumber(String cardNumber) {
        if (cardNumber.length() > 4) {
            return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
        } else {
            return cardNumber; // Not masking if the card number is unexpectedly short
        }
    }

    // Getters for transaction details
    public String getTransactionId() {
        return transactionId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getAmount() {
        return amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public boolean isCommitted() {
        return isCommitted;
    }
}

