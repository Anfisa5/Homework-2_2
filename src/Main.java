public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int increase = 1100;
        int bonus;
        if (increase >= 1000) {
            bonus = (increase) / 100 * 1;
        } else {
            bonus = 0;
        }
        int balance = amount + increase + bonus;
        System.out.println("Бонусные рубли: " + bonus);
        System.out.println("Итоговый счёт: " + balance);
    }

}