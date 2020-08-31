package snackBar;

public class Main
{
    private static void workWithData()
    {

        VendingMachine vm1 = new VendingMachine("office");
        VendingMachine vm2 = new VendingMachine("food");
        VendingMachine vm3 = new VendingMachine("drink");
        // ( String name, int quantity, double cost, int vendingMachineId)
        Snack chips = new Snack("Chips", 36, 1.75, vm2.getId());
        Snack pretzel = new Snack("pretzel", 30, 2.0, vm2.getId());
        Snack chocoBar = new Snack("Chocolate Bar", 36, 1.0, vm2.getId());
        Snack soda = new Snack("Soda", 24, 2.5, vm3.getId());
        Snack water = new Snack("Water", 20, 2.75, vm3.getId());

        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14); 

        System.out.println("Customer " + jane.getName() + " has $" + jane.getCash() + " cash on hand");
        System.out.println("");
        //problem 1
        jane.setCash(jane.buySnacks(jane.getCash(), soda.getCost(), 3));
        soda.setQuantity(soda.getQuantity() - 3);
        System.out.println("Customer " + jane.getName() + " has $" + jane.getCash() + " cash on hand.");
        System.out.println("Expected output above: $" + (45.25 - 7.5));
        System.out.println("New total # of sodas: " + soda.getQuantity());
        System.out.println("");
        //problem 2: Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
        jane.setCash(jane.buySnacks(jane.getCash(), pretzel.getCost(), 1));
        pretzel.setQuantity((pretzel.getQuantity() - 1));
        System.out.println("Jane's new cash on hand is: $" + jane.getCash());
        System.out.println("Expected output above: $" + (37.75 - 2 ));
        System.out.println("New total # of pretzels: "+ pretzel.getQuantity());
        System.out.println("");

        //problem 3: Customer 2 (Bob) buys 2 of snack 4 (Soda).
        bob.setCash(bob.buySnacks(bob.getCash(), soda.getCost(), 2));
        soda.setQuantity(soda.getQuantity() - 2);
        System.out.println("Bob's new cash on hand is: $" + bob.getCash());
        System.out.println("Expected answer above: $" + (33.14 - 2.5 * 2));
        System.out.println("total # of sodas: " + soda.getQuantity());
        System.out.println("");
        //problem 4 Customer 1 (Jane) finds $10.
        jane.setCash(jane.cashInfusion(jane.getCash(), 10.0));
        System.out.println("Jane's new nest egg: $" + jane.getCash());        
        System.out.println("");
        //problem 5 Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar)
        jane.setCash(jane.buySnacks(jane.getCash(), chocoBar.getCost(), 1));
        chocoBar.setQuantity(chocoBar.getQuantity() - 1);
        System.out.println("Jane's new cash on hand: $" + jane.getCash());
        System.out.println("Current total of chocolate bars: " + chocoBar.getQuantity());
        System.out.println("");
        //problem 6 Add 12 more items to snack 3 (Pretzel)
        pretzel.setQuantity(pretzel.increaseQuantity(pretzel.getQuantity(), 12));
        System.out.println("Current total # of Pretzels: " + pretzel.getQuantity());
        System.out.println("");
        //problem 7 Customer 2 (Bob) buys 3 of snack 3 (Pretzel)
        bob.setCash(bob.buySnacks(bob.getCash(), pretzel.getCost(), 3));
        pretzel.setQuantity(pretzel.getQuantity() - 3);
        System.out.println("Bob's current cash on hand is: $" + bob.getCash());
        System.out.println(" Current total # of pretzels: " + pretzel.getQuantity());
        System.out.println("");
        // System.out.println("It would cost $" + snickers.buySnacks(20, snickers.getCost()); + )
    }
    public static void main(String[] args)
    {
        workWithData();
    }
}

//javac SnackBar/*.java
//jar cvfe snackBar.jar snackBar.Main snackBar/*.class
//java -jar  snackBar.jar