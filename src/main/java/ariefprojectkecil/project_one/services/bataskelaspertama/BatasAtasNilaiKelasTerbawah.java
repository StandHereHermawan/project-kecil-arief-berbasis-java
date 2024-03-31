package ariefprojectkecil.project_one.services.bataskelaspertama;

import ariefprojectkecil.project_one.services.NilaiMinimum;
import ariefprojectkecil.project_one.services.class_operations.LebarKelas;

public class BatasAtasNilaiKelasTerbawah {

    private double firstAlternative;

    private double secondAlternative;

    private double thirdAlternative;

    public void setValues(LebarKelas lebarKelas, NilaiMinimum minimum) {
        this.firstAlternative = lebarKelas.getValue() + (minimum.getValue() - 0.5);
        this.secondAlternative = lebarKelas.getValue() + (minimum.getValue() - 1.5);
        this.thirdAlternative = lebarKelas.getValue() + (minimum.getValue() - 2.5);
    }

    public double getFirstAlternative() {
        return firstAlternative;
    }

    public double getSecondAlternative() {
        return secondAlternative;
    }

    public double getThirdAlternative() {
        return thirdAlternative;
    }

    /**
     * Fungsi diatas membutuhkan 2 parameter variabel dengan tipe data int.
     * 1 parameter berasal dari nilai terendah suatu data dan
     * 1 parameter berasal dari lebar kelas.
     * Fungsi diatas memiliki maksud untuk mencari batas nilai terkecil kelas terbawah.
     * Juga diperlukan untuk:
     * - salah satu parameter pada Batas atas nilai kelas terbawah.
     * */
}
