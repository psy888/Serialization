package LMS26Serrializable;

import java.io.Serializable;
import java.time.LocalDate;

public class CreditCard implements Serializable {
    //    public static final long serialVersionUID = -3470869968822055822L;
    private CardType cardType;
    private String bankName;
    private long cardNumber;
    private transient LocalDate exp;
    private transient String cvv;

    public CreditCard(CardType cardType, String bankName, long cardNumber, LocalDate exp, String cvv) {
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

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getExp() {
        return exp;
    }

    public void setExp(LocalDate exp) {
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
                ", exp=" + exp +
                ", cvv='" + cvv + '\'' +
                '}';
    }
}
