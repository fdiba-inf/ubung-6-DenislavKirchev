package exercise6;

import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        assert n > 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
          array[i] = input.nextInt();
        }

        boolean palindrome = true;

        for (int i = 0; i < (array.length + 1) / 2; i++) {
          if (array[i] != array[n - i - 1]){
            palindrome = false;
          }
        
        }
        System.out.println("Palindrome: " + palindrome);
    }
}