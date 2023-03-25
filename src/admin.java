import java.util.Objects;
import java.util.Scanner;
//import searching.searching;

public class admin {

  Scanner sc = new Scanner(System.in);
  int temp, pass, chos, nextPasswd,  going = 0;
  String temp1, user, nextUser;
   String  userName = "admin";
   int passWord =1234;

  public void login() {
    System.out.println("[1] login the admin");
    System.out.println("[2] Reset the password and username");
    System.out.println("[3] Exit");
    going = sc.nextInt();

    if (going == 1) {
      System.out.print("Enter Username : ");
      user = sc.next();
      System.out.print("Enter password : ");
      pass = sc.nextInt();
      System.out.println("login info saved...! ");

      if (Objects.equals(user, userName) || pass == passWord) {
        adminMain();
      } else {
        System.out.println("some thing is Rong check your password");
        login();
      }

    } else if (going == 2) {
      resetPass();
    } else if (going == 3) {
      searching sca = new searching();
      sca.first();
    } else {
      System.out.println("input is invalid...!");
    }
  }

  public void resetPass() {

    System.out.println("[1]Reset password");
    System.out.println("[2]Reset Username");
    System.out.println("[3]Back");
    chos = sc.nextInt();

    if (chos == 1) {
      System.out.print("enter the new password : ");
      nextPasswd = sc.nextInt();
      passWord = temp;
      nextPasswd = passWord;
      System.out.println("password is saved..!");
      resetPass();

    } else if (chos == 2) {
      System.out.print("enter the new username : ");
      nextUser = sc.next();
      userName = temp1;
      nextUser = userName;
      System.out.println("username is saved..!");
      resetPass();

    } else if (chos == 3) {
      login();
    } else {
      System.out.println("enter valid choice");
    }
  }

  public void adminMain() {
    
    System.out.println("[1]Add ne model care's");
    System.out.println("[2]add care's values");
    System.out.println("[3]Exit");
    
   
  }
}
