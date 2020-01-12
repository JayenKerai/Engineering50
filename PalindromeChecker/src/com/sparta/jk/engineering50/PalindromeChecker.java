package com.sparta.jk.engineering50;

/*
- checks if a given string is a palindrome
- checkForPalindrome compares each character to the one opposite it
  - eg. first compared to last, second compared to second-last, etc
- checkForPalindrome2 reverses string and checks if its equal to input string
 */
public class PalindromeChecker {
    private boolean isPalindrome = true;
    private String str;

    public PalindromeChecker(String str) {
        this.str = str.toLowerCase();
    }

    public boolean checkForPalindrome(){
        for (int i = 0; i < str.length()/2; i++){ //only need to check first half against second half of input to be certain
            if (str.charAt(i) == str.charAt(str.length()-i-1)){

            } else {
                isPalindrome = false; //if the input has been proven not to be a palindrome, exit loop immediately
                break;
            }
        }
        return isPalindrome;
    }

    public boolean checkForPalindrome2(){
        StringBuilder str2 = new StringBuilder(str); //converts input to StringBuilder so that .reverse can be used
        return str.equals(str2.reverse().toString()); //compares input to reversed version of input
    }

}
