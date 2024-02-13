package trialexam.perfectnumber;

public class PerfectNumbersChatGPT {

    public static void main(String[] args) {
        for (int i = 2; i <= 10000; i++) {
            if (isPerfect(i)) {
                System.out.println(i + " is a perfect number.");
            }
        }
    }

    public static boolean isPerfect(int num) {
        int sum = 1; // 1 is always a divisor

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) { // add the other divisor
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
}
