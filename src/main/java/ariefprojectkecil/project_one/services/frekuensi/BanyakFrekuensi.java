package ariefprojectkecil.project_one.services.frekuensi;

import ariefprojectkecil.project_one.services.class_operations.BanyakKelas;

public class BanyakFrekuensi {

    private Frekuensi[] banyak;

    public Frekuensi[] getBanyak() {
        return banyak;
    }

    public void setBanyak(BanyakKelas banyakKelas) {
        Frekuensi[] banyakFrekuensi = new Frekuensi[banyakKelas.getValue()];
        for (int i = 0; i < banyakKelas.getValue(); i++) {
            banyakFrekuensi[i] = new Frekuensi();
        }
        this.banyak = banyakFrekuensi;
    }
}
