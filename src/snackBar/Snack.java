package snackBar;

public class Snack {
    //fields
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    //constructor
    public Snack( String name, int quantity, double cost, int vendingMachineId)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    //#region get methods
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getQuantity()
    {
        return quantity;
    } 

    public double getCost()
    {
        return cost;
    }

    public int getVendingMachineId()
    {
        return vendingMachineId;
    }
    //#endregion

    //#region setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }
    //#endregion

    //#region extraneous methods
    public int increaseQuantity(int quantity, int added)
    {
        return quantity = quantity + added;
    }

    public int buySnacks(int howMany, double cost)
    {
        return (int)cost * howMany;
    }

    public int calculateCost(double cost, int quantity )
    {
        return (int)cost * quantity;
    }
    //#endregion

    @Override
    public String toString()
    {
        String rtnStr = "Snack name: " + name + " cost: " + cost + " quantity: " + quantity;

        return rtnStr;
    }
}