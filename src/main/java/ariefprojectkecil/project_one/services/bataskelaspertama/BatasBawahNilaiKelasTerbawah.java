package ariefprojectkecil.project_one.services.bataskelaspertama;

import ariefprojectkecil.project_one.services.NilaiMinimum;

public class BatasBawahNilaiKelasTerbawah {

    private double firstAlternative;

    private double secondAlternative;

    private double thirdAlternative;

    public void setValues(NilaiMinimum minimum) {
        this.firstAlternative = (minimum.getValue() - 0.5);
        this.secondAlternative = (minimum.getValue() - 1.5);
        this.thirdAlternative = (minimum.getValue() - 2.5);
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
     * Fungsi diatas membutuhkan 1 parameter variabel dengan tipe data int.
     * 1 parameter ini berasal dari nilai terendah suatu data.
     * Fungsi diatas memiliki maksud untuk mencari batas nilai terkecil kelas terbawah.
     * Juga diperlukan untuk:
     * - salah satu parameter pada Batas atas nilai kelas terbawah.
     * */
}
