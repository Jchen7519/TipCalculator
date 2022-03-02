public class TipCalculator {
    //Attributes should be bill, tip percentage, number of people.
    private double bill; 
    private int tipPercentage;
    private int numOfPeople;

   //Constructor should have parameters for bill, tip and number of people
   public TipCalculator(double bill, int tipPercentage, int numOfPeople)
   {
       this.bill = bill;
       this.tipPercentage = tipPercentage;
       this.numOfPeople = numOfPeople;
   }
   //getters and setters for all three attributes

    //Write a method using the getters to calculate the tip
    public double calculateTip()
    {
        double tipRate = (double) tipPercentage/100;
        return (bill*tipRate);
    }
    //Write a method using the getters to calculate the total bill
    public double calculateTotalBill()
    {
        double tip = calculateTip();
        return bill + tip;
    }
   //Write a method using the getters to calculate the total tip per person 
    public double calculateTipPerPerson()
    {
        double tip = calculateTip();
        return tip/numOfPeople;
    }
    //Write a method using the getters to calculate the total per person.
    public double calculateTotalPerPerson()
    {
        double totalBill = calculateTotalBill();
        return totalBill/numOfPeople;
    }
}
