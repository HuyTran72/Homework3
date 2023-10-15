class InpersonStudent extends Student {
    private double parkingFee;
    private int numOfClasses;
    private double semesterFee;

    public InpersonStudent(String firstName, String lastName, Year year, String department, double courseFee, double parkingFee, int numOfClasses) {
        super(firstName, lastName, year, department, courseFee);
        this.parkingFee = parkingFee;
        setNumOfClasses(numOfClasses);
        calculateSemesterFee();
    }

    public double getParkingFee() {
        return parkingFee;
    }

    public void setParkingFee(double parkingFee) {
        this.parkingFee = parkingFee;
    }

    public int getNumOfClasses() {
        return numOfClasses;
    }

    public void setNumOfClasses(int numOfClasses) {
        if (numOfClasses >= 1 && numOfClasses <= 5) {
            this.numOfClasses = numOfClasses;
        } else {
            throw new IllegalArgumentException("Number of classes must be between 1 and 5.");
        }
    }

    @Override
    public void calculateSemesterFee() {
        if (numOfClasses <= 3) {
            semesterFee = getCourseFee() * numOfClasses + parkingFee;
        } else {
            semesterFee = getCourseFee() * 3 + parkingFee;
            int extraClasses = numOfClasses - 3;
            semesterFee += (extraClasses * (getCourseFee() * 0.8));
        }
    }

    @Override
    public String toString() {
        return "InpersonStudent{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", year=" + getYear() +
                ", studentId='" + getStudentId() + '\'' +
                ", yearOfGraduation=" + getYearOfGraduation() +
                ", department='" + getDepartment() + '\'' +
                ", courseFee=" + getCourseFee() +
                ", parkingFee=" + parkingFee +
                ", numOfClasses=" + numOfClasses +
                ", semesterFee=" + semesterFee +
                '}';
    }
}