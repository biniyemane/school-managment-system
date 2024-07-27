package org.example;

/**
 * Created by Biniyam Yemaneberhane on 7/26/2024.
 * This class is Responsible for keeping track of Students
 * fees, name, grade and fees
 *
 */

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student by initializing.
     * fees for every student is $30,000
     * fees paid initially is 0
     * @param id for the student: unique.
     * @param name of the student.
     * @param grade  grade of the student
     */

    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //Not going to alter student's name, student's id.

    /**
     *
     * @return
     */

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getId() {
        return id;
    }

    /**
     * Used to update the student's grade
     * @param grade new grade of the student
     */

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Add the fees to the feed paid.
     * The School is going to receive the funds
     * @param fees the fees that student pays
     */
    public void updateFeesPaid(int fees) {
        feesPaid += fees;
    }
}
