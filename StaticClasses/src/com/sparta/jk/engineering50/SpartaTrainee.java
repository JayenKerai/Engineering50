package com.sparta.jk.engineering50;
/*
- Demonstrates basic use of static modifier to count instances of a class and how initialisation blocks are used
 */
public class SpartaTrainee {
    private int traineeId;
    private String traineeName;
    private String gender;
    private static int numberOfSpartaTrainees; //static makes this value the same across all SpartaTrainees

    //initilisation block. Runs every time you run the class (create an object)
    {
        System.out.println("Inside Initialisation block 1");
        numberOfSpartaTrainees++; //increments number of trainees
    }
    //initialisation block 2
    {
        System.out.println("Inside Initialisation block 2");
    }

    //static block. Runs only once, the first time you initialise the class (create an object)
    static {
        System.out.println("Inside static block 1s");
    }

    public SpartaTrainee() {
        /*numberOfSpartaTrainees++;*/
    }

    public static int getProjectedSpartansByEndOfMonth() {
        int onsiteSpartans = 100;
        return onsiteSpartans + numberOfSpartaTrainees;
    }

    public SpartaTrainee(int traineeId, String traineeName, String gender) {
        this.traineeId = traineeId;
        this.traineeName = traineeName;
        this.gender = gender;
        /*numberOfSpartaTrainees ++;*/
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getTraineeName() {
        return traineeName;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    public int getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(int traineeId) {
        this.traineeId = traineeId;
    }

    public static int getNumberOfSpartaTrainees() {
        return numberOfSpartaTrainees;
    }

}
