public class Main {
    public static void main(String[] args) {
        int accountBalance = 200;
        int reflenishmentAmount = 2100;
        int bonusRubles = reflenishmentAmount / 100;
        int finalBill = bonusRubles + accountBalance;
        int noBonusFinBill = accountBalance + reflenishmentAmount;

        if (reflenishmentAmount > 1000) {
            System.out.println("Бонус = " + bonusRubles);
            System.out.println("Итоговая сумма на счету = " + finalBill);
        } else {
            System.out.println("Итоговая сумма на счету = " + noBonusFinBill);
        }

    }
}
