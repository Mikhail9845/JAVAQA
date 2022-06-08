public class Main {

    public static void main(String[] args) {
        int amount = 350;
        int rubles = 20;
        int miles = amount / rubles;
        if (amount >= 20) {
            System.out.println("Ваше количество миль = " + miles);
        } else {
            System.out.println("К сожалению у вас нет миль");
        }

    }

}