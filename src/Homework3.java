import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("몇 개의 수를 입력할 예정인가요? ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.printf("수를 입력하세요: ");
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < num; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 0; i < num; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.printf("최대값: %d\n",max);
        System.out.printf("최소값: %d",min);

    }

}
