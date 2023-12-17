import java.util.HashMap;
import java.util.Map;

public class ArchivOcen {
    private Map<String, Double> tabelaOcen = new HashMap<>();
    public ArchivOcen() {
    }
    public void dodajOcene(double ocena, String przedmiot) {
        tabelaOcen.put(przedmiot, ocena);
    }

    public void printOceny(){
        System.out.println("Przedmiot    Oceny");
        for (Map.Entry<String, Double> entry : tabelaOcen.entrySet()) {
            System.out.println("\n" + entry.getKey() + "    " +entry.getValue());
        }
    }

}
