import java.util.Scanner;
//import searching.carAlg;
//import searching.main;

public class searching {
  Scanner sc = new Scanner(System.in);

  public void first() {
    System.out.printf("---------------------------------------------\n");
    System.out.printf("%30s","Wellcome to GUI\n");
    System.out.printf("---------------------------------------------\n");
    System.out.println("\n[1]Car's full info ");
    System.out.println("[2]Admin");
    int num = sc.nextInt();
    if (num == 1) {

      schEng obj = new schEng();
      obj.consumer();

    } else if (num == 2) {

      admin obj1 = new admin();
      obj1.login();
    } else {
      System.out.print("enter the valid value...");
    }
  }
}
