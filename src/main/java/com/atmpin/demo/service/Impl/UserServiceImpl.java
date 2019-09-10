package com.atmpin.demo.service.Impl;

import com.atmpin.demo.dao.UserDao;
import com.atmpin.demo.domain.Card;
import com.atmpin.demo.domain.User;
import com.atmpin.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;


    @Override
    public User getUserByUserId(String userId) {
        return userDao.getUserByUserId(userId);
    }

    @Override
    public List<Card> getCardListById(String userId) {
        return userDao.getCardListByUserId(userId);
    }
}
