import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class Writer {
    public void fillTheFIle(String USDSell, String USDBuy, String EURSell, String EURBuy) throws IOException {
        var writer = new BufferedWriter(new FileWriter("currency/currency.txt", true));
        var timestamp = new Timestamp(System.currentTimeMillis());
        writer.append(String.format("%s\nCurrency rates:\n\t\t\tUSD/BYN\tEUR/BYN\nBank buy:\t%s\t%s\nBank sell:\t%s\t%s\n\n", timestamp, USDBuy, EURBuy, USDSell, EURSell));
        writer.close();
    }
}