package lektion_2;

import java.time.LocalTime;

public class Uhrzeit {
    public static void main(String[] args) {

        final int SECONDS_PER_DAY = 86400;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;

        int hour = LocalTime.now().getHour();
        int minute = LocalTime.now().getMinute();
        int second = LocalTime.now().getSecond();

        int secSinceMidnight = hour * SECONDS_PER_HOUR + minute * SECONDS_PER_MINUTE + second;
        int secRemaining = SECONDS_PER_DAY - secSinceMidnight;

        float percentage = ((float) secSinceMidnight / (float) SECONDS_PER_DAY) * 100f;

        System.out.println("Vergangene Sekunden seit Mitternacht: " + secSinceMidnight);
        System.out.println("Sekunden heute verbleibend: " + secRemaining);
        System.out.println("Prozent vom Tag vorbei: " + percentage);
    }
}
