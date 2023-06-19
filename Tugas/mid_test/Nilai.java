public class Nilai {
    protected MataKuliah mataKuliah;
    protected int nilaiTugas;

    public void showDetail() {
        System.out.println("Nilai Tugas: " + nilaiTugas);
    }

    public Nilai (int nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }
}

class NilaiKelas extends Nilai {
    private int nilaiUjian;

    public int getNilaiUjian() {
        return nilaiUjian;
    }

    public void setNilaiUjian(int nilaiUjian) {
        this.nilaiUjian = nilaiUjian;
    }

    public void showDetail() {
        System.out.println("----------------");
        System.out.println("Nilai Kelas");
        super.showDetail();
        System.out.println("Nilai Final: " + nilaiUjian);
    }

    public NilaiKelas(int nilaiTugas, int nilaiUjian) {
        super(nilaiTugas);
        this.nilaiUjian = nilaiUjian;
    }
}

class NilaiPraktikum extends Nilai {
    private int nilaiPraktikum;

    public int getNilaiPraktikum() {
        return nilaiPraktikum;
    }

    public void setNilaiPraktikum(int nilaiPraktikum) {
        this.nilaiPraktikum = nilaiPraktikum;
    }

    public void showDetail() {
        System.out.println("----------------");
        System.out.println("Nilai Praktikum");
        super.showDetail();
        System.out.println("Nilai Ujian Praktikum: " + nilaiPraktikum);
    }

    public NilaiPraktikum(int nilaiTugas, int nilaiPraktikum) {
        super(nilaiTugas);
        this.nilaiPraktikum = nilaiPraktikum;
    }
}