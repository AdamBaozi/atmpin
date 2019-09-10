package com.atmpin.demo.service.Impl;

import com.atmpin.demo.dao.CardDao;
import com.atmpin.demo.domain.Card;
import com.atmpin.demo.domain.CardPinResetEntity;
import com.atmpin.demo.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CardServiceImpl implements CardService {

    @Autowired
    CardDao cardDao;

    @Override
    public Card getCardByCardId(String cardId) {
        return cardDao.getCardByCardId(cardId);
    }

    @Override
    public boolean updateCardPin(CardPinResetEntity cardPinResetEntity){
        return cardDao.updateCardPin(cardPinResetEntity);
    }

}
