package trialexam.perfectnumber;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {

    public static void main(String[] args) {
        List<Integer> perfectNumbers = findPerfectNumbers(2, 10000);
        System.out.println(perfectNumbers);
    }

    public static List<Integer> findPerfectNumbers(int start, int end) {
        List<Integer> perfectNumbers = new ArrayList<>();
        for (int i = start; i < end; i++) {
            if (isPerfect(i)) {
                perfectNumbers.add(i);
            }
        }
        return perfectNumbers;
    }

    public static boolean isPerfect(int num) {
        int sum = 1;
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                sum += j;
            }
            if (sum > num) {
                break;
            }
        }
        return sum == num;
    }
}
