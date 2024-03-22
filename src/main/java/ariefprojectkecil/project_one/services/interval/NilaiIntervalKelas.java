package ariefprojectkecil.project_one.services.interval;

import ariefprojectkecil.project_one.services.borderlowerclass.BatasAtasNilaiKelasTerbawah;
import ariefprojectkecil.project_one.services.borderlowerclass.BatasBawahNilaiKelasTerbawah;
import ariefprojectkecil.project_one.services.class_operations.LebarKelas;

public class NilaiIntervalKelas {

    private IntervalKelas[] values;

    public IntervalKelas[] getValues() {
        return values;
    }

    public void setValues(
            BatasAtasNilaiKelasTerbawah batasAtasNilaiKelasTerbawah,
            BatasBawahNilaiKelasTerbawah batasBawahNilaiKelasTerbawah,
            LebarKelas lebarKelas,
            BanyakIntervalKelas banyakIntervalKelas)
    {
        this.values = banyakIntervalKelas.getBanyak();
        for (int i = 0; i < values.length; i++) {

            if (i == 0) {
                values[i].setNilaiMinimumKelas(batasBawahNilaiKelasTerbawah.getSecondAlternative());
                values[i].setNilaiMaksimumKelas(batasAtasNilaiKelasTerbawah.getSecondAlternative());
            } else {
                values[i].setNilaiMinimumKelas(values[i - 1].getNilaiMaksimumKelas());
                values[i].setNilaiMaksimumKelas(values[i].getNilaiMinimumKelas() + lebarKelas.getValue());
            }
        }
    }
}
