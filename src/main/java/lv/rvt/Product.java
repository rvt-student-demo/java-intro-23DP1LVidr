package lv.rvt;

public class Product {
    private double price;    
    private int quantity;
    private String name;
    private int weight;
    private String location;

    public Product(String name, String location, int weight){
        this.name = name;
        this.location = location;
        this.weight = weight;
    }
    public Product(String name){
        this(name,"shelf",1);
    }
    public Product(String name, String location){
        this(name,location,1);
    }
    public Product(String name, int weight){
        this(name,"shelf",weight);
    }

    @Override
    public String toString() {
        return name + " (" + weight + " kg) can be found from the " + location;
    }
}