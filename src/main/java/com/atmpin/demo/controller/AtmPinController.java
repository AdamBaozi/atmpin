package com.atmpin.demo.controller;

import com.atmpin.demo.domain.Card;
import com.atmpin.demo.domain.CardPinResetEntity;
import com.atmpin.demo.service.CardService;
import com.atmpin.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping(value = "/atmpin")
public class AtmPinController {

    @Autowired
    CardService cardService;

    @Autowired
    UserService userService;

    @GetMapping(value = "/cards/{userId}", produces = {"application/json"})
    @ResponseBody
    public Map<String, Object> getCardListByUserId(@PathVariable("userId") String userId){
        System.out.println("to 1");
        Map<String, Object> resultMap = new HashMap<>();
        List<Card> cardList = userService.getCardListById(userId);
        System.out.println("to 2");
        System.out.println(userId);
        resultMap.put("cardList", cardList);

        return resultMap;
    }

    //疑问：这里是当用户选择了要更改的卡之后，就触发去查询该张卡的信息，并且呈现到页面上，同时页面还存在修改的pin输入框
    //使用postMapping还是getmapping
    @GetMapping(value = "/changedcard/{cardId}", produces = {"application/json"})
    @ResponseBody
    public Map<String, Object> getCardByCardId(@PathVariable("cardId") String cardId){
        Map<String, Object> resultMap = new HashMap<>();
        Card card = cardService.getCardByCardId(cardId);
        resultMap.put("card", card);
        return resultMap;
    }

    @PutMapping(value = "/cards/{cardId}", produces = {"application/json"})
    @ResponseBody
    public boolean updateCardPin(@RequestBody CardPinResetEntity cardPinResetEntity){

        boolean res = cardService.updateCardPin(cardPinResetEntity);
        return res;
    }




}
