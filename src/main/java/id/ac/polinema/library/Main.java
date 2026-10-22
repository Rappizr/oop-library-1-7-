package id.ac.polinema.library;

import java.util.Scanner;

/**
 * Titik awal program (satu-satunya method main di proyek ini).
 *
 * Bagian 1: baris PERTAMA output harus persis "Welcome to Polinema Library".
 * Setelah itu kamu bebas menambah baris lain untuk bereksperimen.
 *
 * Bagian 7: di bawah baris sapaan, kamu akan membuat Library, mengisi data
 * contoh, lalu menjalankan LibraryApp. Kerangkanya ada di README.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Polinema Library");

        Library library = new Library("Polinema Library");

        Book book = new Book("978-0132350884", "Clean Code", 2008);
        book.setAuthor(new Author("Robert Martin", "USA"));
        library.addItem(book);

        library.addItem(new Dvd("Inception", 2010, 148));
        library.addItem(new Magazine("Tempo", 2024, 7));

        library.addMember(new Member("M001", "Budi"));

        LibraryApp app = new LibraryApp(library, new Scanner(System.in), System.out);
        app.run();
        // TODO: Tampilkan sebuah teks ke layar.
        // Di Java, perintahnya berbentuk: System.out.println("teks kamu");
        // Ganti teks di dalam tanda kutip dengan teks dari soal. Huruf besar-kecil dan
        // spasi harus persis sama. Tulis perintahnya di dalam kurung kurawal main ini,
        // lalu jalankan programnya.
        //
        // Kerangka:
        //   System.out.println("____");

        // Bagian 7: lanjutkan di sini (buat Library, isi data contoh, jalankan LibraryApp).
    }
}
