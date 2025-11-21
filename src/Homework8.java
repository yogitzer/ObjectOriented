import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args){
        Login login = new Login();
        while(true){
            login.tryLogin();
        }

    }
}
class Login{
    Scanner sc = new Scanner(System.in);
    Map<String, String> table = new HashMap<>();
    public Login(){
        table.put("myId","myPass");
        table.put("myId2","myPass2");
        table.put("myId3","myPass3");
    }
    public void tryLogin(){
        System.out.println("id와 password를 입력해주세요.");
        System.out.printf("id: ");
        String Id = sc.next().trim();
        if(table.containsKey(Id)){
            System.out.printf("password: ");
            String Pwd = sc.next().trim();
            if(table.get(Id).equals(Pwd)){
                System.out.println("id와 비밀번호가 일치합니다.");
            }
            else{
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요,");
            }
        }
        else{
            System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
        }
    }
}