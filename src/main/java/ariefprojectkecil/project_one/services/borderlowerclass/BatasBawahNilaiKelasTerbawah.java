package ariefprojectkecil.project_one.services.borderlowerclass;

import ariefprojectkecil.project_one.services.NilaiMinimum;

public class BatasBawahNilaiKelasTerbawah {

    private double firstAlternative;

    private double secondAlternative;

    private double thirdAlternative;

    public double getFirstAlternative() {
        return firstAlternative;
    }

    public void setFirstAlternative(NilaiMinimum minimum) {
        this.firstAlternative = (minimum.getValue() - 0.5);
    }

    public double getSecondAlternative() {
        return secondAlternative;
    }

    public void setSecondAlternative(NilaiMinimum minimum) {
        this.secondAlternative = (minimum.getValue() - 1.0);
    }

    public double getThirdAlternative() {
        return thirdAlternative;
    }

    public int getValue(){
        return (int) secondAlternative;
    }

    public void setThirdAlternative(NilaiMinimum minimum) {
        this.thirdAlternative = (minimum.getValue() - 1.5);
    }

    /**
     * Fungsi diatas membutuhkan 1 parameter variabel dengan tipe data int.
     * 1 parameter ini berasal dari nilai terendah suatu data.
     * Fungsi diatas memiliki maksud untuk mencari batas nilai terkecil kelas terbawah.
     * Juga diperlukan untuk:
     * - salah satu parameter pada Batas atas nilai kelas terbawah.
     * */
}
