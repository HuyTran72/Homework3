import java.util.Random;

    enum Year {freshman, sophomore, senior, junior};

abstract class Student {

    private String firstName;
    private String lastName;
    private Year year;
    private String studentId; 
    private int yearOfGraduation;
    private String department;
    private double courseFee;

    public Student(String firstName, String lastName, Year year, String studentId, int yearOfGraduation,
            String department, double courseFee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.studentId = studentId;
        this.yearOfGraduation = yearOfGraduation;
        this.department = department;
        this.courseFee = courseFee;
    }

    public String generateId() {
        Random random = new Random();
        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);
        int randomNumber = 1000 + random.nextInt(9000);
        return String.format("%c%c-%04d", firstInitial, lastInitial, randomNumber);
    }
    
    public abstract String toString();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(int yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    

}