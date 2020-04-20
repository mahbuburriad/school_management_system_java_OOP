package school.management.system;

/**
 * Create by Mahbubur Riad
 * This class is responsible for keeping the track
 * of teacher's name, id, salary.
 */

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new Teacher object
     * @param id id for the teacher
     * @param name name of the teacher
     * @param salary salary of the teacher
     */

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     * @return the id of the teacher
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return name of the teacher
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return salary of the teacher
     */

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Adds to salaryEarned
     * Removes from the total money earned by the school.
     * @param salary
     */

    public void receiveSalary(int salary){
        this.salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }



}
