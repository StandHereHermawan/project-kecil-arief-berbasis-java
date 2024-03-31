package ariefprojectkecil.project_one.services;

public class NilaiMinimum {

    private Integer minimum;

    public Integer getValue(){
        return minimum;
    }

    public void setValue(int[] arraysofnumber) {
        int value = 0;
        for (int i = 0; i < arraysofnumber.length; i++) {
            if (value == 0){
                value = arraysofnumber[i];
            }

            if (value > arraysofnumber[i]) {
                value = arraysofnumber[i];
            }
        }
        this.minimum = value;
    }

    /**
     * Fungsi diatas membutuhkan parameter variabel dengan tipe data int[] dengan isi array dari banyak angka.
     * Fungsi diatas memiliki maksud untuk mencari nilai terendah dari banyak angka didalam array.
     * Nilai Terendah dalam data diperlukan untuk:
     * - menjadi parameter Batas nilai terkecil kelas terbawah.
     * - menjadi parameter Jarak data.
     * */
}
