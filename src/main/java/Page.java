import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;


public class Page {
    public ElementsCollection getHeadersRow() {
        return $$x("//table[1]/thead/tr/th");
    }

    public ElementsCollection getUSDRow() {
        return $$x("//table[@class=\"b-currency-table__best\" and contains(. , \"1 USD\")]//td/p/b");
    }

    public ElementsCollection getEURRow() {
        return $$x("//table[@class=\"b-currency-table__best\" and contains(. , \"1 EUR\")]//td/p/b");
    }
}