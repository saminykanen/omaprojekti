import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä nimi: ");



        Henkilo test = new Henkilo("Testi", "Testinen", "1970-1-1", "Helsinki");

        System.out.println(test);

    }
}
