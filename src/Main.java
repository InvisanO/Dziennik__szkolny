import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Scanner scan = new Scanner(System.in);

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

        // Serialization
        uczen1.przegladOcen();
        FileOutputStream fileOut = new FileOutputStream("Osoba.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(uczen1);
        out.close();
        fileOut.close();
        System.out.println("Object saved after serialization");

        //Zapis i odczyt informacji do i z pliku

        // Deserialization must be in new file with class Uczen
        Uczen uczen = null;
        FileInputStream fileIn = new FileInputStream("C:\\Users\\user\\Desktop\\plik12555\\Dziennik-Szkolny\\Osoba.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        uczen = (Uczen) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(uczen.imie);
        System.out.println(uczen.haslo);

        long serialVersionUID = ObjectStreamClass.lookup(uczen.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
        /*if (writer.exists() && writer.isFile()){
            System.out.println("Plik istnieje");
        }
        else{
            System.out.println("Plik nie istnieje");
        }
        */
        try{
            FileWriter writer = new FileWriter("C:\\Users\\user\\Desktop\\plik12555\\Dziennik-Szkolny\\plik189.txt");
            writer.write("First sentence\n");
            writer.append(" ");

            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        try {
            FileReader reader = new FileReader("C:\\Users\\user\\Desktop\\plik12555\\Dziennik-Szkolny\\plik189.txt");
            int dane = reader.read();
            while(dane != -1){
                System.out.print((char) dane);
                dane = reader.read();
            }
            reader.close();

        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

