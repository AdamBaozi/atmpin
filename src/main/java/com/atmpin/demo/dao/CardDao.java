package com.atmpin.demo.dao;

import com.atmpin.demo.domain.Card;
import com.atmpin.demo.domain.CardPinResetEntity;

public interface CardDao {
    Card getCardByCardId(String cardId);
    boolean updateCardPin(CardPinResetEntity cardPinResetEntity);
}
