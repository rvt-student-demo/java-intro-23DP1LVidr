package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    private String adress;

    public Person(String initialName, int initialAge, int initialWeight, int initialHeight) {
        this.age = initialAge;
        this.name = initialName;
        this.weight = initialWeight;
        this.height = initialHeight;
    }

    public Person(String name, String adress){
        this.name = name;
        this.adress = adress;
    }

    public String toCsvRow() {
        return this.name + ", " + this.age + ", " + this.weight + ", " + this.height;
    }
    
    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
    public void growOlder() {
        if (this.age < 30) {
            this.age = this.age + 1;
        }
    }
    public boolean isOfLegalAge() {
        if (this.age < 18) {
            return false;
        }

        return true;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public int getWeight() {
        return this.weight;
    }
    public int getHeight() {
        return this.height;
    }
    public String toString() {
        return this.name + "\n      " + this.adress;
    }
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }
}
