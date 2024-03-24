package ariefprojectkecil.project_one.services.frekuensi;

import java.util.concurrent.atomic.AtomicLong;

public class Frekuensi {

    private Long value = 0L;

    public synchronized Long getValue() {
        return value;
    }

    public synchronized void increment() {
        this.value++;
    }
}
