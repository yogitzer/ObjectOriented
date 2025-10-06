import java.util.Scanner;
public class Homework2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];
        for(int i = 0; i < 3; i++){
            System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            long id = sc.nextLong();
            String name = sc.next();
            String major = sc.next();
            long phone = sc.nextLong();
            students[i] = new Student(id, name, major, phone);
        }
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        System.out.println("첫번째 학생: " + students[0].getId() + " " + students[0].getName() + " " + students[0].getMajor() + " " + students[0].getPhone());
        System.out.println("두번째 학생: " + students[1].getId() + " " + students[1].getName() + " " + students[1].getMajor() + " " + students[1].getPhone());
        System.out.println("세번째 학생: " + students[0].getId() + " " + students[2].getName() + " " + students[2].getMajor() + " " + students[2].getPhone());
    }

}
class Student{
    long id;
    String name;
    String major;
    String phone;
    Student(long id, String name, String major, long phone){
        this.id = id;
        this.name = name;
        this.major = major;
        this.phone = Long.toString(phone);
    }
    long getId(){return id;}
    String getName(){return name;}
    String getMajor(){return major;}
    String getPhone(){return "0" + phone.substring(0,2) + "-" + phone.substring(2, 6) + "-" + phone.substring(6);}
    void setId(long id) { this.id = id; }
    void setName(String name) { this.name = name; }
    void setMajor(String major) { this.major = major; }
    void setPhone(long phone) { this.phone = Long.toString(phone); }
}