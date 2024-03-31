package ariefprojectkecil.project_one.services.interval;

import ariefprojectkecil.project_one.services.class_operations.BanyakKelas;

public class BanyakIntervalKelas {

    private IntervalKelas[] banyak;

    public IntervalKelas[] getBanyak() {
        return banyak;
    }

    public void setValues(BanyakKelas banyakKelas) {
        IntervalKelas[] result = new IntervalKelas[banyakKelas.getValue()];
        for (int i = 0; i < banyakKelas.getValue(); i++) {
            result[i] = new IntervalKelas();
        }
        this.banyak = result;
    }
}
