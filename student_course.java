public class student_course extends stud_marks {
    void course()
    {
        String[] subjects = {"DevOps", "Machine Learning", "C#"};
        int[][] marks = {
            {50, 30, 60}  
        };

        // Assuming each row represents a student and each column represents a subject
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] < 40) {
                    System.out.println("venkatesh " + (i + 1) + " scored less than 40 in " + subjects[j]);
                }
            }     
        }
        }
    public static void main(String args[])
    {
        student_course sc = new student_course();
        sc.stud_det();
        sc.course();
        
    }
}
