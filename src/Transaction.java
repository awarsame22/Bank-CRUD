import java.io.*;

public class Transaction {
    private int id;
    private String name;
    private String description;
    private double price;



    public Transaction(int id, String name, String description, double amount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = amount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void save(){
        Transaction e = null;
        try {

            FileOutputStream fileOut = new FileOutputStream("object.ser");
            // ^ opening a connect to a new file and allowing to connect
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            // ^ streaming data from an object into a file
            out.writeObject(e);
            // take this object and i'm lobbing it
            out.close();
            // close it once we are done with the file
            fileOut.close();
            // close it once we are done with the file
            System.out.println("Your transactions have been saved!");


        } catch (IOException i) {
            i.printStackTrace();
            // history of all the methods that were called - allows us to see where the code went wrong.
            //principle of a stack is similar to pringles - last in, first out
        }

    }
    public void load() {
        Transaction e = null; // this create an object of type employee to receive data from file or return

        try {
            // read object from a file
            FileInputStream file = new FileInputStream("object.ser");
            // create a connect to a file
            ObjectInputStream in = new ObjectInputStream(file);

            // method for deserialization for an object
            e = (Transaction) in.readObject();
            // ^ read object and convert data to type Employee

            in.close();
            file.close();

            System.out.println("Here are your previous transactions: ");
            System.out.println(e.toString());

        } catch (IOException i) {
            i.printStackTrace();

        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", description = " + description +
                ", amount =" + price + "\n";
    }
}
