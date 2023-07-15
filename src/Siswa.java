class Siswa {
    private String nama;
    private int umur;
    private String kelas;

    public Siswa(String nama, int umur, String kelas) {
        this.nama = nama;
        this.umur = umur;
        this.kelas = kelas;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getKelas() {
        return kelas;
    }
}
