import java.util.Scanner;
public class Homework4 {
    int gcd(int m, int n){
        if(n==0){return m;}
        else
            return (gcd(n, m%n));
    }
}
class Test{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.printf("두 수를 입력하세요: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        Homework4 gcd = new Homework4();
        System.out.println("두 수의 최대공약수는 " + gcd.gcd(n, m) + "입니다.");
    }
}