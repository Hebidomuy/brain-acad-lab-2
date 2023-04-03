package Lab18;

public class UserBank {
    public static void main(String[] args) {
        try {
            MoneyTransactionUtil.sendTo(1234567890, 1234569870, 123);
        } catch (AccountException r) {
            System.out.println("Ошибка с реквизитами банка. Возможно, номер карты отправителя и получателя совпадают.");
        }catch (MoneyValueExeption r){
            System.out.println("Ошибка с суммой отправки. Сумма должна быть больше 0. Сумма не должна превышать лимит в 100 000");
        }
    }
}