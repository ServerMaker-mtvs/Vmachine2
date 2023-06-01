package com.ohgiraffers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrintBeverageNameTests {
    private PrintBeverageName printBeverageName;

    // 검증 내용
    // 1. 1을 입력하여 Coffee 가 출력되는지 확인한다.
    // 2. 3을 입력하여 Water 가 출력되는지 확인한다.
    // 2. 6을 입력하여 IllegalArgumentException 발생하는지 확인한다.

    @BeforeEach
    public void setUp () {
        System.out.println("Test SetUP");
        printBeverageName = new PrintBeverageName();
    }

    @Test
    public void testPrintCoffee() {
        // given
        int num = 1;

        //when
        BeverageName result = BeverageName.findBeverageName(num);
        printBeverageName.getBeverageName(num);

        // then
        Assertions.assertEquals("Coffee", result.toString());
    }

    @Test
    public void testPrintWater() {
        // given
        int num = 3;

        //when
        BeverageName result = BeverageName.findBeverageName(num);
        printBeverageName.getBeverageName(num);

        // then
        Assertions.assertEquals("Water", result.toString());
    }

    @Test
    public void testNotMatchBeverage() {
        // given
        int num = 8;

        // when & then
        Assertions.assertThrows(IllegalArgumentException.class, () -> printBeverageName.getBeverageName(num));
    }
}
