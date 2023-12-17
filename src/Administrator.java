import java.util.*;

public class Administrator extends Osoba implements Zarobki, Tablice {

    /**
     * obieg informacji o zaplanowanych zastępstwach oraz odwołanych i przeniesionych lekcjach.
     */

    private String username;
    private static Map<Uczen, ArchivOcen> archivWszystkichOcen = new HashMap<>();

    public void informacjaOZmianach(){

    }

    public void dodajArchiv(ArchivOcen archiv, Uczen uczen){
        archivWszystkichOcen.put(uczen, archiv);
        System.out.println("ArchivOcen dodany dla ucznia: " + uczen);
    }

    @Override
    public <T> List<T> wydrukujZarobki(List<T> Lista) {
        System.out.println("Zarobki:");
        for (T element : Lista) {
            System.out.println(element);
        }
        return Lista;
    }

    public Administrator(String imie, String nazwisko, int telefon, String email, String haslo, String username){
        super(imie, nazwisko, telefon, email, haslo);
        this.username = username;
    }

    @Override
    void pomoc() {

    }

    public static void wyswietlOceny(Uczen uczen) {
        ArchivOcen archivOcen = archivWszystkichOcen.get(uczen);
        if (archivOcen != null) {
            System.out.println("Oceny ucznia " + uczen.getImie() + " " + uczen.getNazwisko() + ": ");
            archivOcen.printOceny();
        } else {
            System.out.println("Brak ArchivOcen dla ucznia: " + uczen.getImie() + " " + uczen.getNazwisko());
        }
    }

    @Override
    public void wydrukujStatystyke(List<String> var) {

    }
    public List<Double> obliczSrednia(List<Double> lista_ocen){

        return lista_ocen;
    }

    public Map<Uczen, ArchivOcen> getArchivOcen() {
        return this.archivWszystkichOcen;
    }
}

