package ariefprojectkecil.project_one.services;

public class NilaiMaksimum {

    private Integer maximum;

    public Integer getMaximum() {
        return maximum;
    }

    public void setMaximum(int[] arraysofnumber) {
        int value = 0;
        for (int i = 0; i < arraysofnumber.length; i++) {
            if (value < arraysofnumber[i]) {
                value = arraysofnumber[i];
            }
        }
        this.maximum = value;
    }

    /**
     * Fungsi diatas membutuhkan parameter variabel dengan tipe data int[] dengan isi array dari banyak angka.
     * Fungsi diatas memiliki maksud untuk mencari nilai tertinggi dari banyak angka didalam array.
     * Nilai tertinggi dalam data diperlukan untuk mencari:
     * - menjadi parameter Jarak Data.
     * */
}
