package com.ohgiraffers;

public class SoldOut {

    public String soldOutCheck (int bevChoice) {
        int cokeChoice = 1;
        int sojuChoice = 2;

        int cokeQuantity = 2;
        int sojuQuantity = 1;

        switch (bevChoice) {
            case 1:
                cokeQuantity = cokeQuantity - 1;
                if (cokeQuantity == 0) {
                    return "Sold Out";
                } else {
                    return "마음껏 추가로 드실 수 있습니다 ^^";
                }
            case 2:
                sojuQuantity = sojuQuantity - 1;
                if (sojuQuantity == 0) {
                    return "Sold Out";
                } else {
                    return "마음껏 추가로 드실 수 있습니다 ^^";
                }
            default:
                return "콜라(1)와, 소주(2) 중에 선택할 수 있습니다";
        }
    }
}
