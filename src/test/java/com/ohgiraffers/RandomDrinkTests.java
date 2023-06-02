package com.ohgiraffers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomDrinkTests {
    private RanmdomDrink randrink;
    private Exception e;
    @BeforeEach
    public void setUp(){
        this.randrink = new RanmdomDrink();
        this.e=new Exception();
    }
    @DisplayName("돈이 0원일때 오류가 발생하는지 확인")
    @Test
    public void testZeroMoney(){
        //given
        int money=0;
        //when&then
//        e=Assertions.assertThrows(IllegalArgumentException.class, ()->randrink.randomDrink(money));
//        e.printStackTrace();
        Assertions.assertThrows(IllegalArgumentException.class, ()->randrink.randomDrink(money));
//        Assertions.assertDoesNotThrow(()->randrink.randomDrink(money));
    }
    @DisplayName("돈이 200원일때 오류가 발생하는지 확인")
    @Test
    public void testNeedMoney(){
        //given
        int money=200;
        //when&then
        Assertions.assertThrows(IllegalArgumentException.class, ()->randrink.randomDrink(money));
//        e=Assertions.assertThrows(IllegalArgumentException.class, ()->randrink.randomDrink(money));
//        e.printStackTrace();
//        Assertions.assertEquals("랜덤 생성 실패!", randrink.randomDrink(money));
    }
    @DisplayName("돈이 800원이상 일때 제대로 작동되는 지 확인")
    @Test
    public void testOverMoney(){
        //given
        int money = 801;
        //when&then
        Assertions.assertDoesNotThrow(()->randrink.randomDrink(money));
    }
}
