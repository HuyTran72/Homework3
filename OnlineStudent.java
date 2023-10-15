class OnlineStudent extends Student {
    private int numOfOnlineClasses;
    private int numOfInpersonClasses;
    private double semesterFee;

    public OnlineStudent(String firstName, String lastName, Year year, String department, double courseFee, int numOfOnlineClasses, int numOfInpersonClasses) {
        super(firstName, lastName, year, department, courseFee);
        setNumOfOnlineClasses(numOfOnlineClasses);
        setNumOfInpersonClasses(numOfInpersonClasses);
        calculateSemesterFee();
    }

    public int getNumOfOnlineClasses() {
        return numOfOnlineClasses;
    }

    public void setNumOfOnlineClasses(int numOfOnlineClasses) {
        if (numOfOnlineClasses >= 0 && numOfOnlineClasses <= 5) {
            this.numOfOnlineClasses = numOfOnlineClasses;
        } else {
            throw new IllegalArgumentException("Number of online classes must be between 0 and 5.");
        }
    }

    public int getNumOfInpersonClasses() {
        return numOfInpersonClasses;
    }

    public void setNumOfInpersonClasses(int numOfInpersonClasses) {
        if (numOfInpersonClasses >= 0 && numOfInpersonClasses <= 5) {
            this.numOfInpersonClasses = numOfInpersonClasses;
        } else {
            throw new IllegalArgumentException("Number of in-person classes must be between 0 and 5.");
        }
    }

    @Override
    public void calculateSemesterFee() {
        double onlineClassCost = getCourseFee() * 1.2 * numOfOnlineClasses;
        double inpersonClassCost = getCourseFee() * numOfInpersonClasses;
        semesterFee = onlineClassCost + inpersonClassCost;
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