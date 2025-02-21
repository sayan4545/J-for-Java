package CollectIonFrameWorkAndMap;

import java.util.EnumMap;
import java.util.Map;

public class EnummapDemo {
    public static void main(String[] args) {
        // array of size of the enum is created
        // nop hashing is done.
        // ordinal/index is used.
        // memory efficient. faster than hashMap
        Map<Day,String> newMap = new EnumMap<>(Day.class);
        newMap.put(Day.MONDAY,"FirstDay");
        newMap.put(Day.TUESDAY,"Second Day");
        newMap.put(Day.WEDNESDAY,"Third day");
        System.out.println(Day.SUNDAY.ordinal());

    }
    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
}
