package ariefprojectkecil.project_one.services.class_operations;

import ariefprojectkecil.project_one.services.JarakData;

public class LebarKelas {

    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(JarakData jarakData, BanyakKelas banyakKelas) {
        double value = (double) jarakData.getValue() / banyakKelas.getValue();
        int nilaiTetap = (int) value;
        int naik1nilai = (nilaiTetap + 1);
        double cekNilai = nilaiTetap + 0.5;

        if (value >= cekNilai) {
            this.value = naik1nilai;
        } else {
            this.value = nilaiTetap;
        }
    }

    /**
     * Fungsi diatas membutuhkan 2 parameter variabel dengan tipe data int.
     * 2 parameter ini berasal dari nilai Jarak data dan nilai Banyak Kelas.
     * Fungsi diatas memiliki maksud untuk menemukan Selisih antara
     * Nilai Terendah suatu Interval Kelas dan
     * Nilai Tertinggi suatu Interval Kelas.
     * */
}
