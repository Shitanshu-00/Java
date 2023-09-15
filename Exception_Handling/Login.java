package Exception_Handling;
import java.util.Scanner;

class PasswordException extends Exception{
    PasswordException(String ermsg){
        super(ermsg);
    }
}
public class Login {
    String username, password;
    void getLoginDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Your Username & Password");
        username=sc.nextLine();
        password=sc.nextLine();
    }
    void verifyLoginDetails(){
        if ("admin".equalsIgnoreCase(username) && "admin".equalsIgnoreCase(password)){
            System.out.println("You're Welcome!");
        }
        else{
            try{
                throw new PasswordException("Invalid Credentials.....Login Again!");
            }catch(PasswordException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class MainClass{
    public static void main(String[] args ) {
        Login user=new Login();
        user.getLoginDetails();
        user.verifyLoginDetails();
    }
}