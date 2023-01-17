import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    //---> 1-ое задание

    Scanner input = new Scanner(System.in);

    System.out.print("Введите 1-ое произвольное целое число: ");
    int x = input.nextInt();

    System.out.print("Введите 2-ое произвольное целое число: ");
    int y = input.nextInt();

    if (Math.abs(x) > Math.abs(y)) {
      int result;
      result = x / 2;
      System.out.println("1-ое число было " + x + " стало: " + result);
    } else {
      System.out.println("1-ое число не больше 2-ого");
    }

    //<--- 1-ое задание

    //---> 2-ое задание

    for (int i = 10; i <= 25; i++) {
      double x = i + 0.4;
      System.out.println(i + " " + x);
    }

    //<--- 2-ое задание

    //---> 3-е задание

    for (int i = 5000; i > 0; i--) {
      if (i % 39 == 0) {
        System.out.println(i);
        break;
      }
    }

    //<--- 3-е задание

    //---> 4-ое задание

    Scanner input = new Scanner(System.in);

    int[] arrNum = new int[10];

    for(int i = 0; i < arrNum.length; i++) {
      System.out.print("Введите целое число: ");
      arrNum[i] = input.nextInt();
    }

    //<--- 4-ое задание
  }

}