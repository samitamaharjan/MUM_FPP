package ExamEqual;

class Marks {
    Student student;
    Professor professor;
    Course course;
    int score;

    public Marks (Student student, Professor professor,
        Course course, int score) {
        this.student = student;
        this.professor = professor;
        this.course = course;
        this.score = score;
    }
}