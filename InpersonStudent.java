public class InpersonStudent extends Student {
    
    private double parkingFee;
    private int numOfClasses;
    private double semesterFee;

    

    public InpersonStudent(String firstName, String lastName, Student.Year year, String studentId, int yearOfGraduation,
            String department, double courseFee, double parkingFee, int numOfClasses, double semesterFee) {
        super(firstName, lastName, year, studentId, yearOfGraduation, department, courseFee);
        this.parkingFee = parkingFee;
        this.numOfClasses = numOfClasses;
        this.semesterFee = semesterFee;
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
            throw new IllegalArgumentException("Number of classes must be between 1 and 5");
        }
    }

    public double getSemesterFee() {
        return semesterFee;
    }

    public void setSemesterFee(double semesterFee) {
        this.semesterFee = semesterFee;
    }

    public void calculateSemesterFee() {
        if(numOfClasses <= 3) {
            semesterFee = getCourseFee() * numOfClasses + parkingFee;
        } else {
            semesterFee = getCourseFee() * 3 + parkingFee;
            int extraClasses = numOfClasses - 3;
            semesterFee += extraClasses *getCourseFee() * 0.8;
        }
    }

    @Override
    public 
}
