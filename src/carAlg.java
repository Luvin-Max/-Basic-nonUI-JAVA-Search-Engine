import java.util.Scanner;

public class carAlg {
  int speed;
  String color;
  String name;
  int rate;
  String type;

  carAlg(String c, int r, int s, String t) {
    // name = n;
    color = c;
    rate = r;
    speed = s;
    type = t;
  }

  carAlg() {
    name = "normal";
    speed = 50;
    color = "black";
    type = "Normal";
    rate = 100000;
  }

  public void run() {
    System.out.println("Search engine is running...");
  }
}

class schEng {
  Scanner sc = new Scanner(System.in);

  public void consumer() {
  System.out.printf("---------------------------------------------\n");
    System.out.printf("%20s","Welcome To The Car Showroom SearchEngine\n");
    
System.out.printf("---------------------------------------------\n");
    // inputs
    carAlg bmw = new carAlg("gold", 1000000, 200, "luxury");
    carAlg aadi = new carAlg("blue", 2000000, 200, "luxury and sports car");
    carAlg honda = new carAlg("white", 3000000, 150, "normal and luxury");
    carAlg hero = new carAlg("red", 100000, 110, "customized");
    carAlg base = new carAlg();

    // get out put
    System.out.println("[1] Bmw" + " ");
    System.out.println("[2]Aadi" + " ");
    System.out.println("[3] Honda" + " ");
    System.out.println("[4] Hero" + " ");
    System.out.println("[5] Normal" + "");
    System.out.println("[6] Exit");
    System.out.print("Choose Your Car:");

    int carType = sc.nextInt();

    if (carType == 1) {
        System.out.printf("---------------------------------------------\n");
      System.out.print("select car is : BMW");
      System.out.println("car color : " + bmw.color);
      System.out.println("car rate : " + bmw.rate);
      System.out.println("care max speed : " + bmw.speed + "Km/H");
      System.out.println("care type : " + bmw.type);
        System.out.printf("---------------------------------------------\n");
    } else if (carType == 2) {
        System.out.printf("---------------------------------------------\n");
      System.out.println("select car is : AADI");
      System.out.println("car color : " + aadi.color);
      System.out.println("car rate : " + aadi.rate);
      System.out.println("care max speed : " + aadi.speed + "Km/H");
      System.out.println("care type : " + aadi.type);
        System.out.printf("---------------------------------------------\n");

    } else if (carType == 3) {
        System.out.printf("---------------------------------------------\n");
      System.out.println("select car is : Honda");
      System.out.println("car color : " + honda.color);
      System.out.println("car rate : " + honda.rate);
      System.out.println("care max speed : " + honda.speed + "Km/H");
      System.out.println("care type : " + honda.type);
        System.out.printf("---------------------------------------------\n");

    } else if (carType == 4) {
        System.out.printf("---------------------------------------------\n");
      System.out.println("select car is : hero");
      System.out.println("car color : " + hero.color);
      System.out.println("car rate : " + hero.rate);
      System.out.println("care max speed : " + hero.speed + "Km/H");
      System.out.println("care type : " + hero.type);
        System.out.printf("---------------------------------------------\n");

    } else if (carType == 5) {
        System.out.printf("---------------------------------------------\n");
      System.out.println("car color : " + base.color);
      System.out.println("car rate : " + base.rate);
      System.out.println("care max speed : " + base.speed + "Km/H");
      System.out.println("care type : " + base.type);
        System.out.printf("---------------------------------------------\n");
    } else if (carType == 6) {
        System.out.printf("---------------------------------------------\n");
      searching sca = new searching();
      sca.first();
        System.out.printf("---------------------------------------------\n");
    } else {
        System.out.printf("---------------------------------------------\n");
      hero.run();
      System.out.println("no need car type's..!");
        System.out.printf("---------------------------------------------\n");
    }
    consumer();
  }
}
