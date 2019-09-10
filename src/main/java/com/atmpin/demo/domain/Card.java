package com.atmpin.demo.domain;

public class Card {

    private String cardId;
    private double balance;
    private String currency;
    private String pinCode;
    private String userId;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Card() {
    }

    public String getCardId() {
        return cardId;
    }

    public double getBalance() {
        return balance;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Card(String cardId, double balance, String currency, String pinCode, String userId) {

        this.cardId = cardId;
        this.balance = balance;
        this.currency = currency;
        this.pinCode = pinCode;
        this.userId = userId;
    }

    public Card(String cardId) {
        this.cardId = cardId;
    }


}
