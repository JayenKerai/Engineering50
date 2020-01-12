package com.sparta.jk.engineering50;

public class Main {
    static {
        System.out.println("static block 1m");
    }
    public static void main(String[] args) {

        //add spartaTrainee1 with individual values
        SpartaTrainee spartaTrainee1 = new SpartaTrainee();

        spartaTrainee1.setTraineeId(1);
        spartaTrainee1.setTraineeName("James");
        spartaTrainee1.setGender("male");

        System.out.println(SpartaTrainee.getNumberOfSpartaTrainees());
        //add spartaTrainee2 using constructor
        SpartaTrainee spartaTrainee2 = new SpartaTrainee(2, "Kajal", "female");
        System.out.println(SpartaTrainee.getNumberOfSpartaTrainees());
        System.out.println(SpartaTrainee.getNumberOfSpartaTrainees());
        System.out.println("number of Spartans on-site at end of month: " + SpartaTrainee.getProjectedSpartansByEndOfMonth());
    }

    static{
        System.out.println("static block 2m");
    }
}
