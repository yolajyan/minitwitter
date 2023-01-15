import java.util.HashMap;
import java.util.Scanner;


public class IDandPasswords {
    HashMap<String, String> logininfo = new HashMap<>();

    IDandPasswords() {
        //userinput to Hashmap
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter username: ");

        // String input
        String name = myObj.nextLine();

        System.out.println("Enter username: ");
        String pwd = myObj.nextLine();

        //examples
        logininfo.put("user", "123");
        logininfo.put("user1", "abc");
        logininfo.put("user2", "a23!");

        logininfo.put(name, pwd);
    }

    protected HashMap getLoginInfo() {
        return logininfo;
    }

}
