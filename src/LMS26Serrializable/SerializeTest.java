package LMS26Serrializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class SerializeTest {
    public static void main(String[] args) {
        CreditCard bankCard = new CreditCard(CardType.VISA,
                "PUMB",
                4925_4542_3245_8574L,
                LocalDate.of(2021, 8, 25),
                "557");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("card.ser"))) {
            oos.writeObject(bankCard);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
