package Lab18;

public class MoneyTransactionUtil {
    private MoneyTransactionUtil() {
    }

    public static void sendTo(int idSender, int idRecipient, double money)throws AccountException, MoneyValueExeption {
        if (idRecipient == idSender)
            throw new AccountException();
        if (money < 1 || money > 100_000)
            throw new MoneyValueExeption();
        System.out.println("Сумма " + money + ", со счета " + idSender + " успешно переведена на счет " + idRecipient);
    }
}