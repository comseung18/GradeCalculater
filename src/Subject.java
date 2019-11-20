public class Subject {
    private String subjectName;
    private String professorName;
    private int degree; // 이수단위 1학점, 2학점, ...
    private Grade grade; // 학점

    public Subject(String subjectName, String professorName, int degree, Grade grade) {
        this.subjectName = subjectName;
        this.professorName = professorName;
        this.degree = degree;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return subjectName + " - " + professorName + " : " + grade + "(" + degree + ")";
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
