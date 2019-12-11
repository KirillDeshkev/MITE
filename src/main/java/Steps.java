import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.open;

public class Steps {
    Page page = new Page();

    public void openTheSite() {
        open("https://kurs.onliner.by/");
    }

    public String getBuyRate(ElementsCollection currencyRow) {
        int buyColumnIndex = 0;
        ElementsCollection tableHeaders = page.getHeadersRow();
        for (int i = 0; i < tableHeaders.size(); i++) {
            if (tableHeaders.get(i).getText().equals("Банк покупает")) {
                buyColumnIndex = i;
            }
        }

        return currencyRow.get(buyColumnIndex).getText();
    }

    public String getSellRate(ElementsCollection currencyRow) {
        int sellColumnIndex = 0;
        ElementsCollection tableHeaders = page.getHeadersRow();
        for (int i = 0; i < tableHeaders.size(); i++) {
            if (tableHeaders.get(i).getText().equals("Банк продаёт")) {
                sellColumnIndex = i;
            }
        }

        return currencyRow.get(sellColumnIndex).getText();
    }

    public String getUSDBuyRate() {
        return getBuyRate(page.getUSDRow());
    }

    public String getEURBuyRate() {
        return getBuyRate(page.getEURRow());
    }

    public String getUSDSellRate() {
        return getSellRate(page.getUSDRow());
    }

    public String getEURSellRate() {
        return getSellRate(page.getEURRow());
    }
}