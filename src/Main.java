import java.util.List;

public class Main {
    public static void main(String[] args) {

        Uczen uczen1 = new Uczen("John", "Bill" ,798044523, "JohnBill@gmail.com",
                "A6893junT","Dobry", "Fajny", "Super");
        Nauczyciel osoba2 = new Nauczyciel("Anthony", "Drake", 798044523, "JohnBill@gmail.com",
                "A6893junT",  3);
        System.out.println(uczen1.getNazwisko());
        System.out.println(uczen1.getImie());
        System.out.println(uczen1.getCharakterystyka());
        System.out.println(osoba2.getDoswiadczenie());

        Administrator administrator = new Administrator("John", "Bill" ,798044523, "JohnBill@gmail.com",
                "A6893junT", "admin");

        //ArchivOcen archivOcen = (ArchivOcen) administrator.getArchivOcen();
        //osoba2.putOcena(archivOcen, uczen1, 4.5);
        //osoba2.putOcena(archivOcen, uczen1, 5.0);

        // Uczen can view grades
        uczen1.przegladOcen();
        //Zapis i odczyt informacji do i z pliku
    }
}

