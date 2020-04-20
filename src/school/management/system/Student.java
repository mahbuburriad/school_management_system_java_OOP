package school.management.system;

/*
* Created by Mahbubur Riad (https://github.com/mahbuburriad/)
* This class is responsible for keeping the
* track of students fees, name, grade & fees
* paid.
*/


public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    /**
     * build constructor for student
     * To create a new student by initializing
     * Fees for every student is $30,000
     * Fees paid initially is 0.
     * @param id id for the student: unique
     * @param name name of the student
     * @param grade grade of the student
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
     * new grade of the student
     * @param grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    /**
     * keep adding the fees to feesPaid Field
     * Add the fees to the fees paid.
     * The school is going to receive the funds.
     * @param fees
     */
    public void payFees(int fees){
        //continuously update the fees
        this.feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);

    }

    /**
     *
     * @return the remaining fees.
     */
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal +
                '}';
    }
}
