public class StudentTester {
    public static void main(String[] args) {
        // Testing InpersonStudent
        InpersonStudent inpersonStudent = new InpersonStudent("John", "Doe", Year.SOPHOMORE, "Computer Science", 1000, 50, 4);
        inpersonStudent.calculateSemesterFee();
        System.out.println(inpersonStudent.toString());

        System.out.println();

        // Testing OnlineStudent
        OnlineStudent onlineStudent = new OnlineStudent("Alice", "Smith", Year.JUNIOR, "Engineering", 900, 3, 2);
        onlineStudent.calculateSemesterFee();
        System.out.println(onlineStudent.toString());
    }
}