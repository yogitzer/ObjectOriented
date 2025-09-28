import java.util.Scanner;

class Student {
    private long studentId;
    private String name;
    private String major;
    private String phone;

    public Student(long studentId, String name, String major, String phone) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    public String getFormattedPhone() {
        return phone.substring(0, 3) + "-" + phone.substring(3, 7) + "-" + phone.substring(7);
    }

    public void printInfo(int index) {
        System.out.println(index + "번째 학생: " + studentId + " " + name + " " + major + " " + getFormattedPhone());
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            long id = sc.nextLong();
            String name = sc.next();
            String major = sc.next();
            String phone = sc.next(); // 010 포함된 번호 그대로 입력
            students[i] = new Student(id, name, major, phone);
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < 3; i++) {
            students[i].printInfo(i + 1);
        }

        sc.close();
    }
}