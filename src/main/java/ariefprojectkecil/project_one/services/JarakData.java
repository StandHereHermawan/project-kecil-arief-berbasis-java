package ariefprojectkecil.project_one.services;

public class JarakData {

    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(NilaiMaksimum maksimum, NilaiMinimum minimum){
        this.value = maksimum.getMaximum() - minimum.getValue();
    }

    /**
     * Fungsi diatas membutuhkan 2 parameter variabel dengan tipe data int.
     * 2 parameter ini berasal dari nilai tertinggi suatu data dan nilai terendah suatu data.
     * Fungsi diatas memiliki maksud untuk menemukan Jarak data.
     * Diperlukan dalam:
     * - Salah satu parameter Lebar Kelas.
     * */
}
