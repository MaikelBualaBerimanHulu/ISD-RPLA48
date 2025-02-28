public class Elektronik {
    private String kodeAlatMusik;
    private String namaAlatMusik;
    private double hargaPerUnit;
    private int stokTersedia;

    public Elektronik(String kodeAlatMusik, String namaAlatMusik, double hargaPerUnit, int stokTersedia) {
        this.kodeAlatMusik = kodeAlatMusik;
        this.namaAlatMusik = namaAlatMusik;
        this.hargaPerUnit = hargaPerUnit;
        this.stokTersedia = stokTersedia;
    }

    public String getKodeAlatMusik() {
        return kodeAlatMusik;
    }

    public String getNamaAlatMusik() {
        return namaAlatMusik;
    }

    public double getHargaPerUnit() {
        return hargaPerUnit;
    }

    public int getStokTersedia() {
        return stokTersedia;
    }

    public void setNamaAlatMusik(String namaAlatMusik) {
        this.namaAlatMusik = namaAlatMusik;
    }

    public void setHargaPerUnit(double hargaPerUnit) {
        this.hargaPerUnit = hargaPerUnit;
    }

    public void setStokTersedia(int stokTersedia) {
        this.stokTersedia = stokTersedia;
    }

    @Override
    public String toString() {
        return "Kode: " + kodeAlatMusik + ", Nama: " + namaAlatMusik + ", Harga: " + hargaPerUnit + ", Stok: " + stokTersedia;
    }
}