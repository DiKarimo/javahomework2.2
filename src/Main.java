public class Main {
    public static void main(String[] args) {
        int balance = 80; // начальный баланс счёта
        int allowance = 1220; // сумма пополнения
        int bonus = allowance / 100; // бонус за пополнение

        int total;
        if (allowance > 1000) {
            total = balance + allowance + bonus;
        } else {
            total = balance + allowance;
        }

        System.out.println("Итоговая сумма на счёте: " + total);
    }
}
