package school.management.system;

import java.util.List;

/**
 * Many Teacher, Many student
 * Implements teachers and students using and ArrayList
 * Created by Mahbubur Riad
 */

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneySpent;
    private int totalMoneyEarned;

    /**
     * new School Object is created
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    /**
     *
     * @return list of teachers in the school
     */

    public List<Teacher> getTeacher() {
        return teachers;
    }

    /**
     * Adds a techer to the school.
     * @param teacher the teacher to be added.
     */

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    /**
     *
     * @return list of students
     */

    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the schoold
     * @param student the student to be added
     */

    public void addStudents(Student student) {
        this.students.add(student);
    }

    /**
     *
     * @return the total money spend by the school
     */

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the total money spend by the school
     * @param MoneySpent
     */

    public void updateTotalMoneySpent(int MoneySpent) {
        this.totalMoneySpent += MoneySpent;
    }

    /**
     *
     * @return the total money earned by the school
     */

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school.
     * @param totalMoneyEarned
     */

    public void updateTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned += totalMoneyEarned;
    }
}
