import static com.codeborne.selenide.Selenide.$x;

public class Page {
    public void getUSDRow() {
        var USDRowElements = $x("//table[@class=\"b-currency-table__best\" and contains(. , \"1 USD\")]//td ");
    }
}
