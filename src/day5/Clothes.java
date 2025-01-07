package day5;

import org.junit.Test;

import java.util.*;

public class Clothes {

    @Test
    public void test() {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"red_sunglasses", "eyewear"}, {"green_turban", "headgear"}, {"crow_mask", "face"}, {"blue_sunglasses", "eyewear"}, {"smoky_makeup", "face"}};

        Map<String, Integer> map = new HashMap<>();

        // 의상 종류별로 의상 수 세기
        for (String[] cloth : clothes) {
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        int result = 0;
        // 각 의상 종류마다 선택할 수 있는 경우의 수 계산
        for (int count : map.values()) {
            result += count;  // 선택지 수 + 1 (아무것도 선택하지 않음)
        }


        int answer = 0;
        for (int i = result; i > 0; i--) {
            answer += result;
        }

        System.out.println(answer);  // 결과 출력
    }

    public static void main(String[] args) {
         
    }
}
