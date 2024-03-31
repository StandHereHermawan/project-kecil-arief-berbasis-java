package ariefprojectkecil.project_one.util;

import ariefprojectkecil.project_one.services.bataskelaspertama.BatasAtasNilaiKelasTerbawah;
import ariefprojectkecil.project_one.services.bataskelaspertama.BatasBawahNilaiKelasTerbawah;
import ariefprojectkecil.project_one.services.class_operations.LebarKelas;
import ariefprojectkecil.project_one.services.frekuensi.Frekuensi;
import ariefprojectkecil.project_one.services.frekuensi.FrekuensiTiapIntervalKelas;
import ariefprojectkecil.project_one.services.interval.BanyakIntervalKelas;
import ariefprojectkecil.project_one.services.interval.NilaiIntervalKelas;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Show {

    public static void menampilkanBanyakIntervalBesertaNilai(BanyakIntervalKelas banyakIntervalKelas,
                                                             BatasAtasNilaiKelasTerbawah batasAtasNilaiKelasTerbawah,
                                                             BatasBawahNilaiKelasTerbawah batasBawahNilaiKelasTerbawah,
                                                             LebarKelas lebarKelas){
        for (int i = 0; i < banyakIntervalKelas.getBanyak().length; i++) {
            if (i == 0) {
                banyakIntervalKelas.getBanyak()[i].setNilaiMinimumKelas(batasBawahNilaiKelasTerbawah.getSecondAlternative());
                banyakIntervalKelas.getBanyak()[i].setNilaiMaksimumKelas(batasAtasNilaiKelasTerbawah.getSecondAlternative());
            } else {
                banyakIntervalKelas.getBanyak()[i].setNilaiMinimumKelas(banyakIntervalKelas.getBanyak()[i - 1].getNilaiMaksimumKelas());
                banyakIntervalKelas.getBanyak()[i].setNilaiMaksimumKelas(banyakIntervalKelas.getBanyak()[i].getNilaiMinimumKelas() + lebarKelas.getValue());
            }
            System.out.println(
                    "Data Nilai Minimum interval kelas ke-" + (i + 1) +
                            " adalah: " +
                            banyakIntervalKelas.getBanyak()[i].getNilaiMinimumKelas()+ ", "
                            + "Data Nilai Maksimum interval kelas " + (i + 1) +
                            " adalah: " +
                            banyakIntervalKelas.getBanyak()[i].getNilaiMaksimumKelas());
        }
    }

    public static void menampilkanBanyakFrekuensi(Frekuensi[] banyak){
        for (int i = 0; i < banyak.length; i++) {
            assertNotNull(banyak[i]);
            System.out.println("Nilai ke " + (i + 1) + " Masing-masing Frekuensi: " + banyak[i].getValue());
        }
    }

    public static void menampilkanNilaiMasingMasingInterval(FrekuensiTiapIntervalKelas frekuensiTiapIntervalKelas) {
        for (int i = 0; i < frekuensiTiapIntervalKelas.getNilaiIntervalKelas().getBanyakFrekuensi().length; i++) {
            System.out.println(
                    "Frekuensi Interval "
                            + (i + 1) +
                            " Dengan Nilai Minimum: " +
                            frekuensiTiapIntervalKelas
                                    .getNilaiIntervalKelas()
                                    .getIntervalKelas()[i]
                                    .getNilaiMinimumKelas()
                            + " Dan" +
                            " Dengan Nilai Maksimum " +
                            frekuensiTiapIntervalKelas
                                    .getNilaiIntervalKelas()
                                    .getIntervalKelas()[i]
                                    .getNilaiMaksimumKelas()
                            + " Dengan Jumlah Frekuensi Sebanyak: " +
                            frekuensiTiapIntervalKelas.getNilaiIntervalKelas().getBanyakFrekuensi()[i].getValue());
        }
    }

    public static void menampilkanNilaiIntervalKelasSesuaiBanyakKelas(NilaiIntervalKelas nilaiIntervalKelas){
        for (int i = 0; i < nilaiIntervalKelas.getIntervalKelas().length; i++) {
            System.out.println(
                    "Data Nilai Maksimum interval kelas " + (i + 1) + " adalah: " +
                            nilaiIntervalKelas.getIntervalKelas()[i].getNilaiMaksimumKelas() + ", "
                            + "Data Nilai Minimum interval kelas " + (i + 1) + " adalah: " +
                            nilaiIntervalKelas.getIntervalKelas()[i].getNilaiMinimumKelas());
        }
    }
}
