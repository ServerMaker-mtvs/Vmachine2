package com.ohgiraffers;

public class PrintBeverageName {
    public void getBeverageName(int num) {
        checkNumRange(num);

        BeverageName result = BeverageName.findBeverageName(num);

        System.out.println("선택한 음료 이름 : " + result);
    }

    // 음료가 존재하지않을 때 IllegalArgumentException 발생
    private void checkNumRange(int num) {
        if (0 > num || 4 < num)
            throw new IllegalArgumentException("해당하는 번호의 음료가 없습니다.");
    }
}

enum BeverageName {
    Milk(0), Coffee(1), GreenTea(2), Water(3), Juice(4);

    private final int num;

    // 생성자
    BeverageName(int num) {
        this.num = num;
    }

    // 입력한 번호의 음료를 찾아서 이름을 반환한다.
    static BeverageName findBeverageName(int num) {
        for (BeverageName beverage : BeverageName.values()) {
            if (num == beverage.num)
                return beverage;
        }
        return null;
    }
}