package com.ohgiraffers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SoldOutTests {

    private SoldOut soldOut;

    @BeforeEach
    public void setUp() {
        soldOut = new SoldOut();
    }

    @DisplayName("콜라 재고가 2개, 소주 재고가 1개 남은 상황에서 각 1개씩 소진했을 때 나오는 문구 확인")
    @Test
    public void testSoldOutNum() {

        // given
        int cokeChoice = 1;
        int sojuChoice = 2;

        int cokeQuantity = 2;
        int sojuQuantity = 1;

        // when
        String cokeResult = soldOut.soldOutCheck(1);
        String sojuResult = soldOut.soldOutCheck(2);

        // then
        Assertions.assertEquals("마음껏 추가로 드실 수 있습니다 ^^", cokeResult);
        Assertions.assertEquals("Sold Out", sojuResult);

    }


}
