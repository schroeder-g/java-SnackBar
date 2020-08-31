package snackBar;

public class VendingMachine {

    //fields
    private static int maxId = 0;
    private int id;
    private String name;

    //constructor
    public VendingMachine(String name)
    {
        maxId++;

        id = maxId;
        this.name= name;
    }

    //#region getters
    public int getId()
    {
        return id;    
    }

    public String getName()
    {
        return name;
    }
    //#endregion

    //#region setters
    public void setName(String name)
    {
        this.name = name;
    }
    //#endregion
    
}