package id.ac.polinema.library;

/**
 * Bagian 3: anggota perpustakaan.
 *
 * Jangan ubah nama kelas, nama method, atau signature-nya. Autograder
 * memanggilnya persis seperti yang tertulis di sini.
 *
 * Field tidak dideklarasikan di sini: baca diagram kelas di README
 * (semua field harus private).
 *
 * Kerangka field (lengkapi dari diagram), letakkan di atas constructor:
 *   private ____ memberId;
 *   private ____ name;
 *   private int loanCount;   // nilai awal 0
 */
public class Member {
    private String memberId;
    private String name;
    private int loanCount;
    private LibraryCard card;

    /**
     * Membuat anggota yang belum punya pinjaman.
     * memberId dan name tidak boleh null atau kosong: lempar
     * IllegalArgumentException jika tidak valid.
     */
    public Member(String memberId, String name) {
        if (memberId == null || memberId.trim().isEmpty()) {
            throw new IllegalArgumentException("Member ID tidak boleh kosong");
        }
        this.memberId = memberId;
        setName(name);
        this.loanCount = 0;
        this.card = new LibraryCard("CARD-"+memberId);
        // TODO Bantuan: validasi dulu sebelum mengisi field. Aturan nama sama dengan setName.
        // Bagian 4: kartu anggota juga dibuat di sini (lihat diagram Bagian 4).
        //
        // Kerangka:
        //   if (memberId == null || ____) {
        //       throw new IllegalArgumentException("____");
        //   }
        //   this.memberId = memberId;
        //   setName(____);
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    public String getMemberId() {
        return memberId;
        // TODO Bantuan: kembalikan data yang disimpan constructor.
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    public String getName() {
        return name;
        // TODO Bantuan: sama seperti getMemberId.
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    /** Nama tidak boleh null atau kosong: lempar IllegalArgumentException dan biarkan nama lama. */
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        this.name = name;
        // TODO Bantuan: periksa dulu, baru isi field.
        //
        // Kerangka:
        //   if (name == null || ____) {
        //       throw new IllegalArgumentException("____");
        //   }
        //   this.name = name;
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    public LibraryCard getCard(){
        return card;
    }
    
    public int getLoanCount() {
        return loanCount;
        // TODO Bantuan: kembalikan jumlah pinjaman saat ini.
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    /** True jika anggota masih boleh meminjam (batasnya 3 pinjaman). */
    public boolean canBorrow() {
        return loanCount < 3;
        // TODO Bantuan: apakah perlu field baru, atau cukup dihitung dari data yang sudah ada?
        //
        // Kerangka:
        //   return loanCount ____ 3;
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    /** Menambah jumlah pinjaman. Jika sudah di batas, tidak berubah dan hasilnya false. */
    public boolean addLoan() {
        if (canBorrow()) {
            loanCount++;
            return true;
        }
        return false;
        // TODO Bantuan: periksa batas dulu. Adakah method lain di kelas ini yang sudah
        // menjawab pertanyaan "boleh atau tidak"?
        //
        // Kerangka:
        //   if (!____) {
        //       return false;
        //   }
        //   loanCount++;
        //   return true;
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    /** Mengurangi jumlah pinjaman. Jika sudah tidak ada pinjaman, tidak berubah dan hasilnya false. */
    public boolean returnLoan() {
        if (loanCount > 0) {
            loanCount--;
            return true;
        }
        return false;
        // TODO Bantuan: batas bawah jumlah pinjaman adalah berapa?
        //
        // Kerangka:
        //   if (loanCount == ____) {
        //       return false;
        //   }
        //   loanCount--;
        //   return true;
        // throw new UnsupportedOperationException("Not implemented yet");
    }
}
