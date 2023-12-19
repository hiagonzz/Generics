import java.util.Scanner;

import Services.PrintService;

public class App {
    public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);

      PrintService ps = new PrintService();
      
      System.out.print("how many values? ");
      int n = sc.nextInt();

      for(int i=0; i< n; i++){
        int value = sc.nextInt();
        ps.addValue(value);
      }

      ps.print();
      System.out.println("First: " + ps.first());
      sc.close();
    }

}
