package com.atmpin.demo.domain;

public class CardPinResetEntity {
    private String cardId;
    private String pinCode;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public CardPinResetEntity(String cardId, String pinCode) {
        this.cardId = cardId;
        this.pinCode = pinCode;
    }

    public CardPinResetEntity() {
    }
}
