import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("What's the bill: ");
        double billAmt = inp.nextDouble();
        
        System.out.print("What's the tip amount: ");
        int tipAmt = inp.nextInt();
        
        System.out.print("How many people: ");
        int peopleAmt = inp.nextInt();
       
        DecimalFormat df = new DecimalFormat("#.##");
        TipCalculator test1 = new TipCalculator(billAmt, tipAmt, peopleAmt);
        System.out.println(" ");
        System.out.println("Results:");
        System.out.println("Tip is: $" + df.format(test1.calculateTip()));
        System.out.println("Total Amount: $" + df.format(test1.calculateTotalBill()));
        System.out.println("Tip Per Person: $" + df.format(test1.calculateTipPerPerson()));
        System.out.println("Total Per Person: $" + df.format(test1.calculateTotalPerPerson()));
        
        inp.close();
        
    }
    
}