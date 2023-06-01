package com.ohgiraffers;

public class MoneyChecker {
    public int inputMoney(int num1){
        CheckZero(num1); //
        if(num1<1000){
            CheckFakeCoin(num1);
        }else{
            CheckFakeMoney(num1);
        }
        return num1;
    }
    public int changeMoney(int num1,int num2){
        int charge=800;
        if(num1<num2*charge){
            throw new IllegalArgumentException("투입금액이 부족합니다.");
        }else if(num1<0||num2<0){
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }else{
            return num1-(num2*charge);
        }
    }
    private static void CheckZero(int num1){
        if(num1<1){
            throw new IllegalArgumentException("금액을 투입해 주세요");
        }
    }
    private static int CheckFakeCoin(int num1){
        if(num1==100){
            return 100;
        }else if(num1==500){
            return 500;
        }else{
            throw new IllegalArgumentException("잘못된 동전입니다.");
        }
    }
    private static int CheckFakeMoney(int num1){
        if(num1==10000){
            return 10000;
        }else if(num1==5000){
            return 5000;
        }else if(num1==1000){
            return 1000;
        }else{
            throw new IllegalArgumentException("잘못된 지폐입니다.");
        }
    }
}
