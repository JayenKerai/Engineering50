package com.sparta.jk.engineering50;

public class Main {
    public static void main(String[] args) {
        PalindromeChecker palindromeCheck = new PalindromeChecker("Madam idssdi Madam");
        System.out.println(palindromeCheck.checkForPalindrome()); //prints out whether input is a palindrome using checkForPalindrome method
        System.out.println(palindromeCheck.checkForPalindrome2()); //prints out whether input is a palindrome using checkForPalindrome2 method
    }
}
