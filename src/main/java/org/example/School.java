package org.example;

import java.util.List;

/**
 * Many teachers, many students
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private  int totalMoneyEarned;
    private int totalMoneySpent;

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    /**
     *
     * @param teacher the teacher to be added
     */

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public void setTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * new school object is created
     * @param teachers list of teachers
     * @param students list of students
     *
     *
     */

    public School(List<Teacher> teachers, List<Student> students){
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }
}
