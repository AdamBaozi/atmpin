package com.atmpin.demo.dao.Impl;


import com.atmpin.demo.dao.CardDao;
import com.atmpin.demo.domain.Card;
import com.atmpin.demo.domain.CardPinResetEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CardDaoImpl implements CardDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Card getCardByCardId(String cardId) {
        String sql = "select * from card where cardId = ?";
        Card card = jdbcTemplate.queryForObject(sql, new Object[]{cardId}, new RowMapper<Card>(){
            @Override
            public Card mapRow(ResultSet resultSet, int i) throws SQLException {
                Card cardTemp = new Card();
                cardTemp.setCardId(resultSet.getString("cardId"));
                cardTemp.setUserId(resultSet.getString("userId"));
                cardTemp.setBalance(Double.parseDouble(resultSet.getString("balance")));
                cardTemp.setCurrency(resultSet.getString("currency"));
                cardTemp.setPinCode(resultSet.getString("pinCode"));
                return cardTemp;
            }
        });
        return card;

    }

    @Override
    public boolean updateCardPin(CardPinResetEntity cardPinResetEntity){
        Integer result;
        try {
            result = jdbcTemplate.update("UPDATE card set pinCode=? where cardId=?", new PreparedStatementSetter() {
                public void setValues(PreparedStatement ps) throws SQLException {
                    ps.setString(1, cardPinResetEntity.getPinCode());
                    ps.setString(2, cardPinResetEntity.getCardId());
                }
            });
            if(result>0){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }

    }
}
