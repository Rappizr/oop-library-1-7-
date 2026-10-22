package id.ac.polinema.library;

/**
 * Bagian 2 dan 3: buku perpustakaan.
 *
 * Jangan ubah nama kelas, nama method, atau signature-nya. Autograder
 * memanggilnya persis seperti yang tertulis di sini.
 *
 * Field tidak dideklarasikan di sini: baca diagram kelas di README.
 * Method untuk bagian berikutnya (setAuthor, getAuthor, dan seterusnya) kamu
 * tambahkan sendiri sesuai diagram di bagian tersebut.
 *
 * Kerangka field (lengkapi tipe dan nama dari diagram), letakkan di atas constructor:
 *   public String isbn;
 *   public ____ title;
 *   public ____ year;
 *   public ____ available;
 */
public class Book {
    private String isbn;
    private String title;
    private int year;
    private boolean available;
    private Author author;

    /**
     * Membuat buku baru yang masih tersedia (belum dipinjam).
     * Bagian 3: isbn tidak boleh kosong; title dan year divalidasi seperti setter-nya.
     */
    public Book(String isbn, String title, int year) {
        if (isbn == null || isbn.trim().isEmpty()) {
            throw new  IllegalArgumentException("ISBN tidak boleh kosong");
        }
        this.isbn = isbn;
        setTitle(title);
        setYear(year);
        this.available = true;
        // TODO Bantuan: isi semua field. Buku baru: apakah sedang dipinjam atau tidak?
        // Bagian 3: aturan validasi judul dan tahun sama dengan setter. Bisakah constructor
        // memakai setter-nya?
        //
        // Kerangka (Bagian 2):
        //   this.isbn = isbn;
        //   this.title = ____;
        //   this.year = ____;
        //   this.available = ____;
        //
        // Kerangka (Bagian 3): ganti dua baris title dan year dengan pemanggilan setter.
        //   setTitle(____);
        //   setYear(____);
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    public String getIsbn() {
        return isbn;
        // TODO Bantuan: kembalikan data yang disimpan constructor.
        //
        // Kerangka:
        //   return ____;
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    public String getTitle() {
        return title;
        // TODO Bantuan: sama seperti getIsbn.
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    public void setTitle(String title){
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Judul tidak boleh kosong");
        }
        this.title = title;
    }

    public int getYear() {
        return year;
        // TODO Bantuan: sama seperti getIsbn.
        // throw new UnsupportedOperationException("Not implemented yet");
    }
    
    public void setYear(int year) {
        if (year <=0) {
            throw new IllegalArgumentException("Tahun harus positif");
        }
        this.year = year;
        // TODO Bantuan: pola yang sama dengan setTitle. Apa syarat tahun yang valid?
        //
        // Kerangka:
        //   if (year ____ 0) {
        //       throw new IllegalArgumentException("____");
        //   }
        //   this.year = year;
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    public Author getAuthor(){
        return author;
    }

    public void setAuthor(Author author){
        this.author = author;
    }
    /** True jika buku sedang ada di perpustakaan (tidak dipinjam). */
    public boolean isAvailable() {
        return available;
        // TODO Bantuan: field apa yang menyimpan status pinjam?
        //
        // Kerangka:
        //   return ____;
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Meminjam buku. Berhasil (true) jika buku tersedia. Jika buku sedang
     * dipinjam, hasilnya false dan keadaan buku tidak berubah.
     */
    public boolean checkOut() {
        if (available) {
            available = false;
            return true;
        }
        return false;
        // TODO Bantuan: apa yang harus kamu periksa lebih dulu sebelum mengubah status?
        // Method ini punya dua jalur return yang berbeda.
        //
        // Kerangka:
        //   if (____) {
        //       return false;
        //   }
        //   ____ = false;
        //   return true;
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    /** Mengembalikan buku: buku bisa dipinjam lagi. */
    public void returnItem() {
        this.available = true;
        // TODO Bantuan: satu baris saja. Status apa yang berubah?
        //
        // Kerangka:
        //   ____ = true;
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Bagian 3. Mengubah judul. Judul null, kosong, atau hanya spasi ditolak
     * dengan IllegalArgumentException, dan judul lama tetap.
     */
    // public void setTitle(String title) {
    //     // TODO Bantuan: periksa dulu, baru isi field. Class String punya method untuk
    //     // memeriksa teks kosong atau hanya spasi. Jangan lupa kemungkinan null.
    //     //
    //     // Kerangka:
    //     //   if (title == null || ____) {
    //     //       throw new IllegalArgumentException("____");
    //     //   }
    //     //   this.title = title;
    //     throw new UnsupportedOperationException("Not implemented yet");
    // }

    /**
     * Bagian 3. Mengubah tahun terbit. Tahun 0 atau negatif ditolak dengan
     * IllegalArgumentException, dan tahun lama tetap.
     */
}
