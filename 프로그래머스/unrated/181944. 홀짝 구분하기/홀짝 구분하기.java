import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        System.out.println(num + (num % 2 ==0 ? " is even" : " is odd"));
    }
}