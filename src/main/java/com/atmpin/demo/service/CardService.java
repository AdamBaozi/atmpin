package com.atmpin.demo.service;

import com.atmpin.demo.domain.Card;
import com.atmpin.demo.domain.CardPinResetEntity;

public interface CardService {
    Card getCardByCardId(String cardId);
    boolean updateCardPin(CardPinResetEntity cardPinResetEntity);
}
