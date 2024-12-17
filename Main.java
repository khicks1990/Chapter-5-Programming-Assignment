import javax.swing.JOptionPane;

public class Main
{
   public static void main(String[] args)
   {
      int numRooms;           // Number of rooms
      int squareFeet;         // Total square feet
      double gallons;         // Gallons of paint needed
      double pricePerGallon;  // Paint price per gallon
      double hours;           // Hours of labor
      double paintCost;       // Total cost of paint
      double labor;           // Labor charges
      double total;           // Total job cost

      // Get the number of rooms.
      numRooms = getRooms();

      // Get the total square feet.
      squareFeet = getSquareFeet(numRooms);

      // Get the total cost.
      total = getTotal(squareFeet);

      // Display the total cost.
      JOptionPane.showMessageDialog(null, String.format(
                     "The total estimated cost is $%,.2f",
                     total));

      System.exit(0);
   }

   /**
      The getRooms method prompts the user for the number
      of rooms.
      @return The value entered by the user.
   */

   public static int getRooms()
   {

   }

   /**
      The getSquareFeet method calculates the total square feet.
      @param rooms The number of rooms.
      @return The total square feet.
   */

   public static int getSquareFeet(int rooms)
   {

   }

   /**
      The getTotal method calculates the total job estimate.
      @param sqFeet The total square feet.
      @return The estimated total.
   */

   public static double getTotal(double squareFeet)
   {
 
   }

   /**
      The getPricePerGallon method prompts the user for the price
      of a gallon of paint.
      @return The value entered by the user.
   */

   public static double getPricePerGallon()
   {

   }

   /**
      The getPaintCost method calculates the total cost of paint.
      @param sqFeet The total square feet.
      @param galPrice The price of a gallon of paint.
      @return The estimated total paint cost.
   */

   public static double getPaintCost(double sqFeet, double galPrice)
   {

   }

   /**
      The getGallons method calculates the gallons of paint.
      @param sqFeet The total square feet.
      @return The estimated number of gallons.
   */

   public static double getGallons(double sqFeet)
   {
 
   }

   /**
      The getHours method calculates the number of labor hours.
      @param sqFeet The total square feet.
      @return The estimated number of labor hours.
   */

   public static double getHours(double sqFeet)
   {

   }

   /**
      The getLabor method calculates the total labor cost.
      @param hours The number of labor hours.
      @return The estimated cost of labor.
   */

   public static double getLabor(double hours)
   {

   }
}

