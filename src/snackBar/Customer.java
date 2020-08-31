package snackBar;

public class Customer {
    //fields
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;

    //constructor
    public Customer(String name, double cash)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.cash = cash;
    }    

    //#region getters
    public String getName()
    {
        return name;
    }

    public double getCash()
    {
        return cash;
    }

    public int getId()
    {
        return id;
    }
    //#endregion

    //#region setters
    public void setName(String name)
    {
        this.name =  name;
    }

    public void setCash(double cash)
    {
        this.cash = cash;
    }
    //#endregion

    //#region extraneous methods
    public double cashInfusion(double cash, double payDay)
    {
        return cash + payDay;
    }

    public double buySnacks(double cash, double snackCost, int quantity)
    {
        return cash - (snackCost * quantity);
    }
    //#endregion

    @Override
    public String toString()
    {
        String rtnStr = "Customer name: " + name + " $$$: " + cash;

        return rtnStr;
    } 
}