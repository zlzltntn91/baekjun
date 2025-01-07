package day4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Set<String> numbers = new HashSet<>(Arrays.asList(phone_book));
        for (String phone : numbers) {
            for (int i = 0; i < phone.length(); i++) {
                if (numbers.contains(phone.substring(0, i))) {
                    return false;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        boolean solution = phoneBook.solution(
                new String[]{"53", "3445", "123", "125", "567", "88", "129", "344", "124"});
        System.out.println(solution);
    }
}
