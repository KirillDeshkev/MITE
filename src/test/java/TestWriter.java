import org.junit.jupiter.api.*;

import java.io.File;
import java.io.IOException;

public class TestWriter {

    @Test
    @Order(1)
    @DisplayName("Check file is being created")
    void checkFileCreated() throws IOException {
        var writer = new Writer();
        writer.fillTheFIle("2.000", "2.000", "2.000", "2.000");
        assert new File("currency/currency.txt").isFile();
    }

    @Test
    @Order(2)
    @DisplayName("Check data writes to file")
    void checkDataAdded() {
        assert new File("currency/currency.txt").length() > 0;
    }

    @Test
    @Order(3)
    @DisplayName("Check data appends to file")
    void checkDataAppends() throws IOException {
        var fileSizeBeforeTest = new File("currency/currency.txt").length();
        var writer = new Writer();
        writer.fillTheFIle("2.000", "2.000", "2.000", "2.000");
        assert new File("currency/currency.txt").length() > fileSizeBeforeTest;
    }
}
