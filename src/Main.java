import java.util.Scanner;

public class Main {


    public static void main(String[]args){
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int ISup1,ISup2, ISup3, days,Numsupplies, Itemsselld1,ISup4,Itemsselld2;

        double dSup1, dSup2,dSup3, SupCost, Sup1Tot, Sup2Tot, Sup3Tot, Sumsupplies, Profit,salesd1, salesd2,Selld1, dSup4,Sup4Tot,Selld2;
        double Totsales;
        System.out.println("");

        System.out.println("Enter the number of supplies you need");
        Numsupplies = keyboard.nextInt();
        System.out.println("How many days of sales");
        days = keyboard.nextInt();
        System.out.println("What is the cost of supply item 1");
        dSup1 = keyboard.nextDouble();
        System.out.println("How many did you buy of supply item 1");
        ISup1 = keyboard.nextInt();
        System.out.println("What is the cost of supply item 2");
        dSup2 = keyboard.nextDouble();
        System.out.println("How many did you buy of supply item 2");
        ISup2 = keyboard.nextInt();
        System.out.println("What is the cost of supply item 3");
        dSup3 = keyboard.nextDouble();
        System.out.println("How many did you buy of supply item 3");
        ISup3 = keyboard.nextInt();
        System.out.println("What is the cost of supply item 4");
        dSup4 = keyboard.nextDouble();
        System.out.println("How many did you buy of supply item 4");
        ISup4 = keyboard.nextInt();

        Sup1Tot = (ISup1*dSup1);
        Sup2Tot = (ISup2*dSup2);
        Sup3Tot = (ISup3*dSup3);
        Sup4Tot = (ISup4*dSup4);
        SupCost = (Sup1Tot+Sup2Tot+Sup3Tot+Sup4Tot);
        Sumsupplies = (days*SupCost);

        System.out.println("The calculated cost of supplies is: $"+Sumsupplies);

        System.out.println("How many items did you sell on day 1");
        Itemsselld1 = keyboard.nextInt();
        System.out.println("How many items did you sell on day 1");
        Selld1 = keyboard.nextDouble();
        System.out.println("How many items did you sell on day 2");
        Itemsselld2 = keyboard.nextInt();
        System.out.println("How many items did you sell on day 2");
        Selld2 = keyboard.nextDouble();
        salesd1 = (Selld1*Itemsselld1);
        salesd2 = (Selld2*Itemsselld2);
        Totsales = (salesd1+salesd2);

        System.out.println("Total sales for day 1 is: $"+salesd1);
        System.out.println("Total sales for day 2 is: $"+salesd2);
        Profit = (salesd1-Sumsupplies);

        System.out.println("Profit: $"+Profit);











    }
}
