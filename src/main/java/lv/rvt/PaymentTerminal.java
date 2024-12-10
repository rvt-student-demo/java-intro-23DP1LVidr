package lv.rvt;
public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment>=2.5) {
            payment -= 2.5;
            money +=2.5;
            affordableMeals +=1;
            return payment;
        } else{
            return payment;
        }   

    }

    public double eatHeartily(double payment) {
        if (payment>=4.3) {
            payment -= 4.3;
            money += 4.3;
            heartyMeals +=1;
            return payment;
        } else{
            return payment;
        }   
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.takeMoney(2.5) == true) {
            money += 2.5;
            affordableMeals += 1;
            return true;
        } else{
            return false;
        }

        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.takeMoney(4.3) == true) {
            money += 4.3;
            heartyMeals += 1;
            return true;
        } else{
            return false;
        }

        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
    }
}