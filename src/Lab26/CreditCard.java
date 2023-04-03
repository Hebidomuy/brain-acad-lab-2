package Lab26;

import java.io.Serializable;

public class CreditCard implements Serializable {
    private CardType cardType;
    private String bankName;
    private int cardNumber;
    private String exp;
    private String cvv;

    public CreditCard(CardType cardType, String bankName, int cardNumber, String exp, String cvv) {
        this.cardType = cardType;
        this.bankName = bankName;
        this.cardNumber = cardNumber;
        this.exp = exp;
        this.cvv = cvv;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardType=" + cardType +
                ", bankName='" + bankName + '\'' +
                ", cardNumber=" + cardNumber +
                ", exp='" + exp + '\'' +
                ", cvv='" + cvv + '\'' +
                '}';
    }

  public enum CardType{
        VISA, MASTER_CARD
    }
}