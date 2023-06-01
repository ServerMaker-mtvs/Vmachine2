package com.ohgiraffers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MoneyCheckTest {

    private MoneyChecker InputMoney;
    private MoneyChecker ChargeMoney;
    private Exception e;

    @BeforeEach
    public void setUp(){
        this.InputMoney=new MoneyChecker();
        this.e=new Exception();
        this.ChargeMoney=new MoneyChecker();
    }
    //  1. 지폐의 금액을 입력받아 인지된 금액을 리턴함 ( 돈단위 이외의 수 or 음수 입력시  에러메시지 출력)
    //  2. 동전은 100,500원 지폐는 1000, 5000, 10000원권만 사용가능함
    //  3. 투입금액, 음료 구매갯수를 입력받아, 거스름돈을 계산하여 금액을 리턴함  (거스름돈이 음수일 경우 에러메시지 출력)

    @DisplayName("정상돈 인식")
    @Test
    public void testRealArgument(){
        //given
        int num1=100; //100원 동전
        int num2=5000; //5000원 지폐


        //when
        int result= InputMoney.inputMoney(num1);
        int result2= InputMoney.inputMoney(num2);


        //then
        Assertions.assertEquals(100,result);
        Assertions.assertEquals(5000,result2);
    }
    @DisplayName("위조지폐 인식")
    @Test
    public void testFakeArgument(){
        //given
        int num3=900; //900원 동전
        int num4=0; //0원
        int num5=50000; //50000원 지폐

        //when
        e=Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> InputMoney.inputMoney(num3)
        );
        System.out.println(e);
        e=Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> InputMoney.inputMoney(num4)
        );
        System.out.println(e);
        e=Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> InputMoney.inputMoney(num5)
        );
        System.out.println(e);

        //then

    }
    @DisplayName("거스름돈 정상 작동 확인")
    @Test
    public void testChangeArgument(){
        //given
        int num1=10000; //만원
        int num2=5; //800원x5개
        int num3=1000; //천원
        int num4=2; //800원x2개
        int num5=1000; //천원
        int num6=-2;//800원x-2개

        //when
        int result= ChargeMoney.changeMoney(num1, num2);
        e=Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> ChargeMoney.changeMoney(num3, num4)
        );
        System.out.println(e);
        e=Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> ChargeMoney.changeMoney(num5, num6)
        );
        System.out.println(e);
        //then

    }
}
