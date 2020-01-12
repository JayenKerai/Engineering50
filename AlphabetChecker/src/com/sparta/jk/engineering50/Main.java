package com.sparta.jk.engineering50;

public class Main {
    public static void main(String[] args) {
        AlphabetChecker alphabetChecker = new AlphabetChecker("the quick brown fox jumps over the lazy dog");
        System.out.println(alphabetChecker.hasAlphabet());
    }

}
