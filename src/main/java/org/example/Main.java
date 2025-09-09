package org.example;

public class Main {
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);

        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String[] words = {"Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"};

        String numStr = String.valueOf(number);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            result.append(words[digit]).append(" ");
        }

        return result.toString().trim();
    }

}
