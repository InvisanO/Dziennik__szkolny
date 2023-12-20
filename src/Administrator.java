import java.util.*;
import java.util.function.Predicate;

// Standalone
public class Administrator extends Osoba implements Zarobki, Tablice {

    /**
     * obieg informacji o zaplanowanych zastępstwach oraz odwołanych i przeniesionych lekcjach.
     */
    private String username;
    static Map<Uczen, ArchivOcen> archivWszystkichOcen = new HashMap<>();
    public void informacjaOZmianach(){/*
        List<Zastepstwo> zaplanowaneZastepstwa = getPlannedSubstitutions();
        List<Lekcja> odwolaneLekcje = getCanceledLessons();

        System.out.println("Planned Substitutions:");
        for (Zastepstwo zastepstwo : zaplanowaneZastepstwa) {
            System.out.println("Date: " + zastepstwo.getData() + ", Substitute Teacher: " + zastepstwo.getNauczycielZastepujacy());
        }

        System.out.println("\nCanceled/Shifted Lessons:");
        for (Lekcja lekcja : odwolaneLekcje) {
            System.out.println("Date: " + lekcja.getData() + ", Reason: " + lekcja.getPowodOdwolania());
        }*/
    }
    public void dodajArchiv(ArchivOcen archiv, Uczen uczen){
        archivWszystkichOcen.put(uczen, archiv);
        System.out.println("ArchivOcen dodany dla ucznia: " + uczen);
    }
    @Override
    public <T> void wydrukujZarobki(List<T> Lista) {
        System.out.println("Zarobki:");
        for (T element : Lista) {
            System.out.println(element);
        }
    }
    // doesn't allow user to use the functionality of the program
    public void delete(Uczen uczen){
        archivWszystkichOcen.remove(uczen);
        System.out.println("Usunięto ucznia: " + uczen.getImie() + " " + uczen.getNazwisko());
    }

    public void delete(Nauczyciel nauczyciel){
        // Implement logic to remove teacher and related data
        // For example, you might remove the teacher's assignments, evaluations, etc.
        System.out.println("Usunięto nauczyciela: " + nauczyciel.getImie() + " " + nauczyciel.getNazwisko());
    }

    public Administrator(String imie, String nazwisko, int telefon, String email, String haslo, String username) {
        super(imie, nazwisko, telefon, email, haslo);
        this.username = username;
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
    //public <T> void wydrukujStatystyke() {}

    @Override
    public <T> void find(List<T> data, Predicate<T> condition) {
        List<T> result = new ArrayList<>();
        for (T item : data) {
            if (condition.test(item)) {
                result.add(item);
            }
        }
        // You can use the result list as needed
        System.out.println("Found items: " + result);
    }

    @Override
    public <T> void sort(List<T> data, Comparator<T> criterion) {
        data.sort(criterion);
        System.out.println("Sorted data: " + data);
    }

    @Override
    public double obliczSrednia(List<Double> lista_ocen){
        double srednia = 0;
        double sum = 0;
        if(lista_ocen.size() < 2){
            throw new RuntimeException();
        }
        for (int i = 0; i < lista_ocen.size(); i++){
            sum += lista_ocen.get(i);
        }
        srednia = (sum/lista_ocen.size());
        return srednia;
    }

    public Map<Uczen, ArchivOcen> getArchivOcen() {
        return this.archivWszystkichOcen;
    }
}

   // Allow administrators to manage user accounts, reset passwords, or deactivate accounts.