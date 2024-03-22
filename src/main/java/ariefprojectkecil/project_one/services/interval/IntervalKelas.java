package ariefprojectkecil.project_one.services.interval;

import ariefprojectkecil.project_one.services.borderlowerclass.BatasAtasNilaiKelasTerbawah;
import ariefprojectkecil.project_one.services.borderlowerclass.BatasBawahNilaiKelasTerbawah;

public class IntervalKelas {

    private double nilaiMaksimumKelas;

    private double nilaiMinimumKelas;

    public double getNilaiMaksimumKelas() {
        return nilaiMaksimumKelas;
    }

    public void setNilaiMaksimumKelas(double nilaiMaksimumKelas) {
        this.nilaiMaksimumKelas = nilaiMaksimumKelas;
    }

    public double getNilaiMinimumKelas() {
        return nilaiMinimumKelas;
    }

    public void setNilaiMinimumKelas(double nilaiMinimumKelas) {
        this.nilaiMinimumKelas = nilaiMinimumKelas;
    }
}
