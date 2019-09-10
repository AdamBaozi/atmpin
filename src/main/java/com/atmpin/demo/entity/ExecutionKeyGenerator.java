package com.atmpin.demo.entity;

import java.security.SecureRandom;
import java.util.Random;

public class ExecutionKeyGenerator {

    StringBuilder executionKey;

    public StringBuilder getExecutionKey() {
        return executionKey;
    }

    public void setExecutionKey(StringBuilder executionKey) {
        this.executionKey = executionKey;
    }

    public String generateExecutionKey(){
        StringBuilder uid = new StringBuilder();
        //产生16位的强随机数
        Random rd = new SecureRandom();
        for(int i=0; i< 16; i ++){
            //产生0-2的3位随机数
            int type = rd.nextInt();
            switch(type){
                case 0:
                    //0-9的随机数
                    uid.append(rd.nextInt(10));
                    break;
                case 1:
                    //ASCII在97-122之间为小写，获取小写随机
                    uid.append((char)(rd.nextInt(25)+97));
                    break;
                case 2:
                    //ASCII在65-90之间为大写，获取大写随机
                    uid.append((char)(rd.nextInt(25)+65));
                    break;
                default:
                    break;
            }
        }
        return uid.toString();
    }
}
