package lv.rvt;

public class HealthStation {
    int weighPerformed = 0;
    public int weigh(Person person) {
        weighPerformed += 1;
        return person.getWeight();
    }
    public void feed(Person person) {
        int weigh = person.getWeight()+1;
        person.setWeight(weigh);
    }
    public int weighings() {
        return weighPerformed;
    }
}
