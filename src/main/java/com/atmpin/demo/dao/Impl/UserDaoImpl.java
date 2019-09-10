package com.atmpin.demo.dao.Impl;

import com.atmpin.demo.dao.UserDao;
import com.atmpin.demo.domain.Card;
import com.atmpin.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public User getUserByUserId(String userId) {
        String sql = "select * from user where userId = ?";
        User user = jdbcTemplate.queryForObject(sql, new Object[]{userId}, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User userTemp = new User();
                userTemp.setUserId(resultSet.getString("userId"));
                userTemp.setPassword(resultSet.getString("password"));
                return userTemp;
        }
        });
                return user;
    }

    @Override
    public List<Card> getCardListByUserId(String userId) {
        String sql = "select * from card where userId = ?";
        System.out.println(sql);
        List<Card> cardList = jdbcTemplate.query(sql, new Object[]{userId}, new BeanPropertyRowMapper(Card.class));
        return cardList;
    }
}
