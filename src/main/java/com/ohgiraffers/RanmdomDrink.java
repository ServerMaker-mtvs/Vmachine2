package com.ohgiraffers;

import java.util.Objects;
import java.util.Scanner;

public class RanmdomDrink {
    private int rancount=0;
    public String randomDrink(int money){
        checking(money);
        return "랜덤 선택된 음료"+rancount+"번";
    }

    private void checking(int money) {
        if(money <=0){
            throw new IllegalArgumentException("잔액을 넣어주세요");
        }
        if(money <800){
            throw new IllegalArgumentException("잔액이 부족합니다");
        }
        rancount=(int)(Math.random()*5+1);
        if(!(1<=rancount&&rancount<=5)){
            throw new IllegalArgumentException("랜덤값이 잘못 설정되었습니다");
        }
    }
}
