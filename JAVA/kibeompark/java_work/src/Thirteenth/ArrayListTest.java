package Thirteenth;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("MILK");
        list.add("BREAD");
        list.add("BUTTER");

        list.add(1, "APPLE");
        list.add(2, "GRAPE");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("***************************");
        list.remove(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

// Queue(ArrayList) 연습 문제
// 20명이 승차할 수 있는 열차가 있다.
// 이 열차에 50명이 예매를 하려고 한다.
// 50명 중 누가 예매에 성공했는지 출력하도록 프로그래밍 해 보자 !
// 랜덤을 사용해야 한다.
// 1 ~ 20 까지 중복되지 않는 숫자가 할당된다.
// 사용자는 0 ~ 49 까지 순차적으로 예매를 하는 형식이 아니며
// 랜덤한 숫자로 0 ~ 49 까지 중 선별되어 예매를 할 수 있게 되어 있는 시스템이다.