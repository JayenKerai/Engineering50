package com.sparta.jk.engineering50;
/*
- prints factors (numbers that multiply into x) of the number provided in constructor
 */
public class FactorFinder {
    int number;

    public FactorFinder(int number) {
        this.number = number;
    }

    public String printFactors() {
        String str = "";
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number; j++){
                if (i * j == number){
                    str = str + " " + i + " and " + j + ",";
                }
            }
        }
        return str;
    }

}
