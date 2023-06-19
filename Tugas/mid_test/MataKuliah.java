public class MataKuliah {
    private String kodeMatkul;
    private String namaMatkul;
    private int sks;
    
    public String getKodeMatkul() {
        return kodeMatkul;
    }
    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }
    public String getNamaMatkul() {
        return namaMatkul;
    }
    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }
    public int getSks() {
        return sks;
    }
    public void setSks(int sks) {
        this.sks = sks;
    }

    public MataKuliah() {
        
    }
}

class Mahasiswa extends MataKuliah {
    private String nama;
    private String nim;
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void show(String namaMatkul) {
        System.out.println("Nilai Matkul - " + super.getNamaMatkul());
    }

}
