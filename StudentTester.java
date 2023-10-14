public class StudentTester {
    public static void main(String[] args) {
        // Testing InpersonStudent
        InpersonStudent inpersonStudent = new InpersonStudent("John", "Doe", Year.junior, "KT-1234", 2025, "Computer Science", 1050.5d, 50, 4, 102.23d);
        inpersonStudent.calculateSemesterFee();
        System.out.println(inpersonStudent.toString());

        // Testing OnlineStudent
        // OnlineStudent onlineStudent = new OnlineStudent("John", "Doe", Year.sophomore, "KT-1234", 2025, "Computer Science", 1050.5, 50, 5, 100.2);
        // onlineStudent.calculateSemesterFee();
        // System.out.println(onlineStudent.toString());
    }
}
