package ariefprojectkecil.project_one.services.bataskelaspertama;

public class NilaiTengah {

    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(
            BatasAtasNilaiKelasTerbawah batasAtasNilaiKelasTerbawah,
            BatasBawahNilaiKelasTerbawah batasBawahNilaiKelasTerbawah,
            int optionAlternative) {
        double value;
        if (optionAlternative == 1){
            value = batasAtasNilaiKelasTerbawah.getFirstAlternative() + batasBawahNilaiKelasTerbawah.getFirstAlternative();
        } else if (optionAlternative == 2) {
            value = batasAtasNilaiKelasTerbawah.getSecondAlternative() + batasBawahNilaiKelasTerbawah.getSecondAlternative();
        } else if (optionAlternative == 3) {
            value = batasAtasNilaiKelasTerbawah.getThirdAlternative() + batasBawahNilaiKelasTerbawah.getThirdAlternative();
        } else {
            value = batasAtasNilaiKelasTerbawah.getSecondAlternative() + batasBawahNilaiKelasTerbawah.getSecondAlternative();
        }
        double result = value / 2;
        this.value = result;
    }
}
