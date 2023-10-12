public class OnlineStudent extends Student {

    private int numOfOnlineClasses;
    private int numOfInpersonClasses;
    private double semesterFee;
    
    

    public OnlineStudent(String firstName, String lastName, Student.Year year, String studentId, int yearOfGraduation,
            String department, double courseFee, int numOfOnlineClasses, int numOfInpersonClasses, double semesterFee) {
        super(firstName, lastName, year, studentId, yearOfGraduation, department, courseFee);
        this.numOfOnlineClasses = numOfOnlineClasses;
        this.numOfInpersonClasses = numOfInpersonClasses;
        this.semesterFee = semesterFee;
    }


    public int getNumOfOnlineClasses() {
        return numOfOnlineClasses;
    }

    public void setNumOfOnlineClasses(int numOfOnlineClasses) {
        if(numOfOnlineClasses >= 0 && numOfOnlineClasses <= 5){
            this.numOfOnlineClasses = numOfOnlineClasses;
        } else {
            throw new IllegalArgumentException("Number of online classes must be between 0 and 5");
        }
    }

    public int getNumOfInpersonClasses() {
        return numOfInpersonClasses;
    }

    public void setNumOfInpersonClasses(int numOfInpersonClasses) {
        if(numOfInpersonClasses >= 0 && numOfInpersonClasses <= 5){
            this.numOfInpersonClasses = numOfInpersonClasses;
        } else {
            throw new IllegalArgumentException("Number of in-person classes must be between 0 and 5");

        }
    }

    public double getSemesterFee() {
        return semesterFee;
    }
    
    public void calculateSemesterFee() {
        double onlineClassFee = getCourseFee() * 1.2 * numOfOnlineClasses;
        double inpersonClassFee = getCourseFee() * numOfInpersonClasses;
        semesterFee = onlineClassFee + inpersonClassFee;
    }

    @Override
    public String toString() {
        return "OnlineStudent{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", year=" + getYear() +
                ", studentId='" + getStudentId() + '\'' +
                ", yearOfGraduation=" + getYearOfGraduation() +
                ", department='" + getDepartment() + '\'' +
                ", courseFee=" + getCourseFee() +
                ", numOfOnlineClasses=" + numOfOnlineClasses +
                ", numOfInpersonClasses=" + numOfInpersonClasses +
                ", semesterFee=" + semesterFee +
                '}';
    }    
}
