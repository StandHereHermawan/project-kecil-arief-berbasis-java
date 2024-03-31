package ariefprojectkecil.project_one.services.interval;

import ariefprojectkecil.project_one.services.bataskelaspertama.BatasAtasNilaiKelasTerbawah;
import ariefprojectkecil.project_one.services.bataskelaspertama.BatasBawahNilaiKelasTerbawah;
import ariefprojectkecil.project_one.services.class_operations.LebarKelas;
import ariefprojectkecil.project_one.services.frekuensi.BanyakFrekuensi;
import ariefprojectkecil.project_one.services.frekuensi.Frekuensi;

public class NilaiIntervalKelas {

    private Frekuensi[] banyakFrekuensi;

    private IntervalKelas[] intervalKelas;

    public IntervalKelas[] getIntervalKelas() {
        return intervalKelas;
    }

    public Frekuensi[] getBanyakFrekuensi() {
        return banyakFrekuensi;
    }

    public void setNilaiPerBanyakIntervalKelas(
            BatasAtasNilaiKelasTerbawah batasAtasNilaiKelasTerbawah,
            BatasBawahNilaiKelasTerbawah batasBawahNilaiKelasTerbawah,
            LebarKelas lebarKelas,
            BanyakIntervalKelas banyakIntervalKelas)
    {
        this.intervalKelas = banyakIntervalKelas.getBanyak();
        for (int i = 0; i < intervalKelas.length; i++) {

            if (i == 0) {
                intervalKelas[i].setNilaiMinimumKelas(batasBawahNilaiKelasTerbawah.getSecondAlternative());
                intervalKelas[i].setNilaiMaksimumKelas(batasAtasNilaiKelasTerbawah.getSecondAlternative());
            } else {
                intervalKelas[i].setNilaiMinimumKelas(intervalKelas[i - 1].getNilaiMaksimumKelas());
                intervalKelas[i].setNilaiMaksimumKelas(intervalKelas[i].getNilaiMinimumKelas() + lebarKelas.getValue());
            }
        }
    }

    public void setValues(BanyakFrekuensi banyakFrekuensi) {
        this.banyakFrekuensi = banyakFrekuensi.getBanyak();
    }
}
