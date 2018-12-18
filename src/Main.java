import java.util.Scanner;

public class Main {


    public static void main(String[]args){
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int ISup1,ISup2, ISup3, days,Numsupplies, ISup5,Itemsselld1,ISup4,Itemsselld2, ISup6;
        int Itemsselld3,Itemsselld4,Itemsselld5,ISup7,ISup8,ISup9,ISup10;
        double dSup1, dSup2,dSup3, SupCost, Sup1Tot, Sup2Tot, Sup3Tot, Sumsupplies, Profit;
        double Totsales, dSup5,Sup5Tot, salesd1, salesd2,Selld1, dSup4,Sup4Tot,Selld2;
        double dSup6, Sup6Tot,salesd3,salesd4,salesd5,Selld3,Selld4,Selld5,dSup7,dSup8,dSup9,dSup10;
        double Sup7Tot,Sup8Tot,Sup9Tot,Sup10Tot;

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
        System.out.println("What is the cost of supply item 5");
        dSup5 = keyboard.nextDouble();
        System.out.println("How many did you buy of supply item 5");
        ISup5 = keyboard.nextInt();
        System.out.println("What is the cost of supply item 6");
        dSup6 = keyboard.nextDouble();
        System.out.println("How many did you buy of supply item 6");
        ISup6 = keyboard.nextInt();
        System.out.println("What is the cost of supply item 7");
        dSup7 = keyboard.nextDouble();
        System.out.println("How many did you buy of supply item 7");
        ISup7 = keyboard.nextInt();
        System.out.println("What is the cost of supply item 8");
        dSup8 = keyboard.nextDouble();
        System.out.println("How many did you buy of supply item 8");
        ISup8 = keyboard.nextInt();
        System.out.println("What is the cost of supply item 9");
        dSup9 = keyboard.nextDouble();
        System.out.println("How many did you buy of supply item 9");
        ISup9 = keyboard.nextInt();
        System.out.println("What is the cost of supply item 10");
        dSup10 = keyboard.nextDouble();
        System.out.println("How many did you buy of supply item 10");
        ISup10 = keyboard.nextInt();



        Sup1Tot = (ISup1*dSup1);
        Sup2Tot = (ISup2*dSup2);
        Sup3Tot = (ISup3*dSup3);
        Sup4Tot = (ISup4*dSup4);
        Sup5Tot = (ISup5*dSup5);
        Sup6Tot = (ISup6*dSup6);
        Sup7Tot = (ISup7*dSup7);
        Sup8Tot = (ISup8*dSup8);
        Sup9Tot = (ISup9*dSup9);
        Sup10Tot = (ISup10*dSup10);
        SupCost = (Sup1Tot+Sup2Tot+Sup3Tot+Sup4Tot+Sup5Tot+Sup6Tot+Sup7Tot+Sup8Tot+Sup9Tot+Sup10Tot);
        Sumsupplies = (SupCost);
        System.out.println(SupCost);
        System.out.println("The calculated cost of supplies is: $"+Sumsupplies);

        System.out.println("How many items did you sell on day 1");
        Itemsselld1 = keyboard.nextInt();
        System.out.println("How much did the items sell for.");
        Selld1 = keyboard.nextDouble();
        System.out.println("How many items did you sell on day 2");
        Itemsselld2 = keyboard.nextInt();
        System.out.println("How much did the items sell for.");
        Selld2 = keyboard.nextDouble();
        System.out.println("How many items did you sell on day 3");
        Itemsselld3 = keyboard.nextInt();
        System.out.println("How much did the items sell for.");
        Selld3 = keyboard.nextDouble();
        System.out.println("How many items did you sell on day 4");
        Itemsselld4 = keyboard.nextInt();
        System.out.println("How much did the items sell for.");
        Selld4 = keyboard.nextDouble();
        System.out.println("How many items did you sell on day 5");
        Itemsselld5 = keyboard.nextInt();
        System.out.println("How much did the items sell for.");
        Selld5 = keyboard.nextDouble();

        salesd1 = (Selld1*Itemsselld1);
        salesd2 = (Selld2*Itemsselld2);
        salesd3 = (Selld3+Itemsselld3);
        salesd4 = (Selld4+Itemsselld4);
        salesd5 = (Selld5+Itemsselld5);
        Totsales = (salesd1+salesd2+salesd3+salesd4+salesd5);

        System.out.println("Total sales for day 1 is: $"+salesd1);
        System.out.println("Total sales for day 2 is: $"+salesd2);
        System.out.println("Total sales for day 3 is: $"+salesd3);
        System.out.println("Total sales for day 4 is: $"+salesd4);
        System.out.println("Total sales for day 5 is: $"+salesd5);
        System.out.println("Total sales for both days: $"+Totsales);


        Profit = (Totsales-Sumsupplies);

        System.out.println("Profit: $"+Profit);











    }
}
