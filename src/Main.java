import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        GradeCalculator gradeCalculator = new GradeCalculator();

        gradeCalculator.addSubject(
                new Subject("C++ 프로그래밍","이재협",3, Grade.APLUS),
                new Subject("컴퓨터공학입문","김홍연", 3, Grade.F))
                .calculate()
                .saveFile("내 학점");

        System.out.println(gradeCalculator);
    }
}
