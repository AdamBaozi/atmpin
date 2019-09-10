package com.atmpin.demo.dao;

import com.atmpin.demo.domain.Card;
import com.atmpin.demo.domain.User;

import java.util.List;

public interface UserDao {

    User getUserByUserId(String userId);
    List<Card> getCardListByUserId(String userId);
}
