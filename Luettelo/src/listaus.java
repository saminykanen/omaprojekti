import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class listaus {

    public void haeTiedostosta(String nimi, String polku) {
        Path tiedosto = Paths.get("kirjasto/", "henkilot.txt");
       try {
           List<String> rivit = Files.readAllLines(tiedosto);
           if (!(rivit.isEmpty())) {
               for (String rivi : rivit) {
                   List<String> osat = Arrays.asList(rivi.split(";"));
               }
           }
       } catch  (FileNotFoundException ex){
           System.out.println("Tiedostoa ei löydy");
       } catch (IOException ex) {
           System.out.println("Virhe luettaessa tiedostoa");
       }
    }

}
