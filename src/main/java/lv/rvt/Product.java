package lv.rvt;

public class Product {
    private double price;
    private String name;
    private int quantity;
    private String location;

    public Product(String name, String location, int weight){
        
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
}
