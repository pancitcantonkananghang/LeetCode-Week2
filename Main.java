import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int input = scanner.nextInt();
        
        Solution sol = new Solution();
        System.out.println("Result: " + sol.isPalindrome(input));
        
        scanner.close();
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = 0;
        int num = x;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        return (rev == x);
    }
}