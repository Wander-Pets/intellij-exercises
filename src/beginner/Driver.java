package beginner;

public class Driver {
    public static void main(String[] args) {
        Subject subject1 = new Subject("TPG10AB",
                "Technical Programming 1");
        Student student1 = new Student("JC Jaime",
                1021234);
        ExamPaper paper = new ExamPaper(student1, subject1, 100);

        System.out.println("Subject code: " +
                paper.getSubject().getSubjectCode());

        System.out.println("Student number: " +
                paper.getStudent().getStudentNumber());
    }
}
