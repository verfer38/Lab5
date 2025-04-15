package util;
import java.util.TreeSet;

public class IdGenerator {
    private static long currentId = 0;
    private static TreeSet<Long> availableIds = new TreeSet<>();

    public static long generate() {
        if (!availableIds.isEmpty()) {
            return availableIds.pollFirst();
        }
        return ++currentId;
    }
    public static void releaseId(long id) {
        if (id > 0 && id <= currentId) {
            availableIds.add(id);
        }
    }

    public static void updateMaxId(long id) {
        if (id > currentId) {
            currentId = id;
        }
    }
    public static void updateCurrentId(long id) {
        if (id > currentId) {
            currentId = id;
        }
    }
}