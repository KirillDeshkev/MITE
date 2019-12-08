import static com.codeborne.selenide.Selenide.open;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("run");
        getTheSite();
    }

    public static void getTheSite() throws InterruptedException {
        open("https://kurs.onliner.by/");
    }
}
