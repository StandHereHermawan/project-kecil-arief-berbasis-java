package ariefprojectkecil.project_one.services.class_operations;

public class BanyakKelas {

    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(int[] arrayData) {
        double value = 1 + 3.3 * Math.log10(arrayData.length);
        double valueTurun1Nilai = (int) value;
        double valueCheck = valueTurun1Nilai + 0.5;
        double valueNaik1Nilai = (valueTurun1Nilai + 1);

        if (value >= valueCheck) {
            this.value = (int) valueNaik1Nilai;
        } else {
            this.value = (int) valueTurun1Nilai;
        }
    }

    /**
     * Fungsi diatas membutuhkan parameter variabel dengan tipe data int[] dengan isi array dari banyak angka.
     * Fungsi diatas memiliki maksud untuk mencari nilai banyak kelas dari banyak sebaran nilai data.
     * yang diperlukan untuk mencari:
     * - Salah satu parameter Lebar Kelas,
     * - Salah satu parameter Batas atas Kelas.
     * */
}
