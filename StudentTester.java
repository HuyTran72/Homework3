public class StudentTester {
    public static void main(String[] args) {
        InpersonStudent inpersonStudent = new InpersonStudent("Kenny", "Tran", Year.junior, KT-1234, 2025, "Software Engineering", 1500, 200, 4, 1);
        inpersonStudent.calculateSemesterFee();
        System.out.println(inpersonStudent.toString());

        OnlineStudent onlineStudent = new OnlineStudent("Alice", "Smith", Year.freshman, "Engineering", 900);
    }
}
