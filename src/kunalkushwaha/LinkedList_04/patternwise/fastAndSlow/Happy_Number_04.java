package kunalkushwaha.LinkedList_04.patternwise.fastAndSlow;

// LeetCode 202
public class Happy_Number_04 {

    public static void main(String[] args) {

        int n = 19;

        boolean result = isHappy(n);

        System.out.println(result);
    }

    private static boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        do {

            slow = findSquare(slow);

            fast = findSquare(findSquare(fast));

        } while (slow != fast);

        return slow == 1;
    }

    private static int findSquare(int num) {

        int ans = 0;

        while (num > 0) {

            int rem = num % 10;

            ans = ans + (rem * rem);

            num = num / 10;
        }

        return ans;
    }
}