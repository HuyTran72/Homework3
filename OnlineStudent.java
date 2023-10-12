public class OnlineStudent extends Student {

    int numOfOnlineClasses;
    int numOfInpersonClasses;
    
    public OnlineStudent(String firstName, String lastName, Student.Year year, String studentId, int yearOfGraduation,
            String department, double courseFee, int numOfOnlineClasses, int numOfInpersonClasses) {
        super(firstName, lastName, year, studentId, yearOfGraduation, department, courseFee);
        this.numOfOnlineClasses = numOfOnlineClasses;
        this.numOfInpersonClasses = numOfInpersonClasses;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }

    public int getNumOfOnlineClasses() {
        return numOfOnlineClasses;
    }

    public void setNumOfOnlineClasses(int numOfOnlineClasses) {
        if(numOfOnlineClasses >= 1 && numOfOnlineClasses <= 5){
            this.numOfOnlineClasses = numOfOnlineClasses;
        } esle {
            throw new IllegalArgumentException("Number of classes must be between 1 and 5")
        }
    }

    public int getNumOfInpersonClasses() {
        return numOfInpersonClasses;
    }

    public void setNumOfInpersonClasses(int numOfInpersonClasses) {
        this.numOfInpersonClasses = numOfInpersonClasses;
    }

    public void calculateSemesterFee {

    }

    
}
