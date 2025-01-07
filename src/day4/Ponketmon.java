package day4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class Ponketmon {

    public int solution(int[] nums) {
        Integer[] objects = Arrays.stream(nums)
                                 .boxed()
                                 .toArray(Integer[]::new);
        Set<Integer> ponketmons = new HashSet<>(Arrays.asList(objects));

        int i = nums.length / 2;
        int ponSize = ponketmons.size();

        return i < ponSize ? i : ponSize;
    }


    public static void main(String[] args) {
        int nums[] = {3, 1, 2, 3};
        int nums1[] = {3, 1, 2, 4, 5};
        int nums2[] = {3, 1, 2, 3, 1, 2};
        int nums3[] = {3, 1, 2, 3, 0, 0, 5};

        Ponketmon p = new Ponketmon();
        assertThat(p.solution(nums)).isEqualTo(3);
        assertThat(p.solution(nums1)).isEqualTo(5);
        assertThat(p.solution(nums2)).isEqualTo(3);
        assertThat(p.solution(nums3)).isEqualTo(5);

    }
}
