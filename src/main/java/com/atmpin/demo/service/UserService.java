package com.atmpin.demo.service;

import com.atmpin.demo.domain.Card;
import com.atmpin.demo.domain.User;

import java.util.List;

public interface UserService {
    User getUserByUserId(String userId);
    List<Card> getCardListById(String userId);
}
