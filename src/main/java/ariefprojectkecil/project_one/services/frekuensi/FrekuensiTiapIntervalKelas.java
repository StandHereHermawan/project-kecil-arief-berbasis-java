package ariefprojectkecil.project_one.services.frekuensi;

import ariefprojectkecil.project_one.services.interval.IntervalKelas;
import ariefprojectkecil.project_one.services.interval.NilaiIntervalKelas;

public class FrekuensiTiapIntervalKelas {

    private NilaiIntervalKelas nilaiIntervalKelas;

    public NilaiIntervalKelas getNilaiIntervalKelas() {
        return nilaiIntervalKelas;
    }

    public void setNilaiIntervalKelas(int[] data, NilaiIntervalKelas nilaiIntervalKelas) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < nilaiIntervalKelas.getValues().length; j++) {
                if (j == 0){
                    if (data[i] >= nilaiIntervalKelas.getValues()[j].getNilaiMinimumKelas() && data[i] <= nilaiIntervalKelas.getValues()[j].getNilaiMaksimumKelas()) {
                        nilaiIntervalKelas.getBanyakFrekuensi()[j].increment();
                    }
                } else {
                    if (data[i] > nilaiIntervalKelas.getValues()[j - 1].getNilaiMaksimumKelas() && data[i] <= nilaiIntervalKelas.getValues()[j].getNilaiMaksimumKelas()) {
                        nilaiIntervalKelas.getBanyakFrekuensi()[j].increment();
                    }
                }
            }
        }
        this.nilaiIntervalKelas = nilaiIntervalKelas;
    }
}
