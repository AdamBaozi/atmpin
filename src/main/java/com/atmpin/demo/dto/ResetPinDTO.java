package com.atmpin.demo.dto;

import com.atmpin.demo.entity.ExecutionKeyGenerator;

public class ResetPinDTO {
    private String cardId;
    private String pinCode;
    private String executionKey;

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

    public ResetPinDTO(String cardId, String pinCode) {
        this.cardId = cardId;
        this.pinCode = pinCode;
    }

    public ResetPinDTO() {
    }

    public String getExecutionKey() {
        return executionKey;
    }

    public void setExecutionKey(String executionKey) {
        this.executionKey = executionKey;
    }

    public String generateExecutionKey(){
        ExecutionKeyGenerator executionKeyGeneratorInstance = new ExecutionKeyGenerator();
        String executionKey = executionKeyGeneratorInstance.generateExecutionKey();
        return executionKey;
    }
}
