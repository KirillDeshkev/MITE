import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;


public class Page {
    public ElementsCollection getHeadersRow() {
        return  $$x("//table[1]/thead/tr/th");
    }

    public void getUSDRow() {
        var USDRowElements = $$x("//table[@class=\"b-currency-table__best\" and contains(. , \"1 USD\")]//td");
    }

    public void getEURRow() {
        var USDRowElements = $$x("//table[@class=\"b-currency-table__best\" and contains(. , \"1 EUR\")]//td");
    }

    public void getBuyRate(){
        var tableHeaders = getHeadersRow();
        for (int i = 0; i < tableHeaders.size(); i++) {
            if (tableHeaders.get(i).getText().equals("Банк покупает")){
                int buyColumn = i;
            }
        }

        var
    }
}
