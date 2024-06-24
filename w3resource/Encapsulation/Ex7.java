// 7. Write a Java program to create a class called Student with private instance variables student_id,
// student_name, and grades. Provide public getter and setter methods to access and modify the student_id and variables.
// However, provide a method called addGrade() that allows adding a grade to the grades variable while performing
// additional validation.

class Student {

    private int student_id;
    private String student_name;
    private int[] grades;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public void addGrade(int grade) {
        if (grades == null) {
            grades = new int[1];
            grades[0] = grade;
        } else {
            int[] newGrades = new int[grades.length + 1];
            for (int i = 0; i < grades.length; i++) {
                newGrades[i] = grades[i];
            }
            newGrades[grades.length] = grade;
            grades = newGrades;
        }
    }

    public int[] getGrades() {
        return grades;
    }
}

class Ex7 {

    public static void main(String[] args) {
        Student student = new Student();
        student.setStudent_id(1);
        student.setStudent_name("John Doe");
        student.addGrade(90);
        student.addGrade(80);
        student.addGrade(70);
        student.addGrade(60);
        student.addGrade(50);
        student.addGrade(40);
        student.addGrade(30);
        student.addGrade(20);
        student.addGrade(10);
        student.addGrade(0);
        System.out.println("Student ID: " + student.getStudent_id());
        System.out.println("Student Name: " + student.getStudent_name());
        System.out.println("Grades: ");
        for (int grade : student.getGrades()) {
            System.out.println(grade);
        }
    }
}
