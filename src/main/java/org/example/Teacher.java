package org.example;

public class Teacher {

    /**
     * Created by Biniyam Yemaneberhane on 7/26/2024
     * This class is responsible for keeping the track
     * of the teacher's name, id, salary
     */
    private int id;
    private String name;
    private int salary;

    public Teacher(int id, String name, int salary) {

        /**
         * creates a new Teacher Object
         * @param id id for the teacher
         * @param name name of the teacher
         * @param salary salary of the teacher
         *
         */

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     *
     * @return the id of teacher
     */

    public int getId() {
        return id;
    }

    /**
     *
     * @return return name of teacher
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return the salary of teacher
     */
    public int getSalary(){
        return salary;
    }

    /**
     * set the salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary = salary;
    }
}
