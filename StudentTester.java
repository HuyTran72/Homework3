public class StudentTester {
    public static void main(String[] args) {
        // Testing InpersonStudent
        InpersonStudent inpersonStudent = new InpersonStudent("Cristiano", "Ronaldo", Year.SENIOR, "Computer Science", 1500, 70, 4);
        inpersonStudent.calculateSemesterFee();
        System.out.println(inpersonStudent.toString());

        System.out.println();

        // Testing OnlineStudent
        OnlineStudent onlineStudent = new OnlineStudent("David", "Beckham", Year.JUNIOR, "Software Engineering", 1200, 2, 3);
        onlineStudent.calculateSemesterFee();
        System.out.println(onlineStudent.toString());
    }
}