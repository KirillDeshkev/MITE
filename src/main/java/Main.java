import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class Main {
    public static void main(String[] args) throws IOException {
        var steps = new Steps();
        steps.openTheSite();
        var writer = new Writer();
        writer.fillTheFIle(steps.getUSDSellRate(), steps.getUSDBuyRate(), steps.getEURSellRate(), steps.getEURBuyRate());
    }
}