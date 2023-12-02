


public class Main {
    public static void main(String[] args) {

        Uczen uczen1 = new Uczen("John", "Bill" ,798044523, "JohnBill@gmail.com", "A6893junT","Dobry", "Fajny", "Super");
        Nauczyciel osoba2 = new Nauczyciel("Anthony", "Drake", 798044523, "JohnBill@gmail.com", "A6893junT", "matematyka", 3);
        System.out.println(uczen1.getNazwisko());
        System.out.println(uczen1.getImie());
        System.out.println(uczen1.getCharakterystyka());
        System.out.println(osoba2.getDoswiadczenie());

        Administrator administrator = new Administrator();

        ArchivOcen archivOcen = uczen1.getArchivOcen();


        nauczyciel.putOcena(archivOcen, uczen, 4.5);
        nauczyciel.putOcena(archivOcen, uczen, 5.0);

        // Uczen can view grades
        List<Double> oceny = uczen.getOceny();
        System.out.println("Oceny: " + oceny);



        
        //Zapis i odczyt informacji do i z pliku






    }
}