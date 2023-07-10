package chapter3;

import static java.lang.System.exit;

public class Clock {

    private int hour;
    private int minutes;
    private int seconds;


    public Clock(int hour, int minutes, int seconds){
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setHour(int hour) {
        if (hour > 0 && hour < 24) {
            this.hour = hour;
            System.out.printf("%d:%d:%d", this.hour, minutes, seconds);
        }
        else {
            this.hour = 0;
        }

    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minutes) {
        if (minutes < 60 && minutes > 0) {
            this.minutes = minutes;
            System.out.printf("%d:%d:%d", hour, this.minutes, seconds);
        }
        else if (minutes > 59) {
            hour = minutes / 60;
            this.minutes = minutes % 60;
            System.out.printf("%d:%d:%d", hour, this.minutes, seconds);
        }
        else {
            exit(0);
        }

    }

    public int getMinute() {
        return minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds > 0 && seconds < 60){
            this.seconds = seconds;
            System.out.printf("%d:%d:%d", hour, minutes, seconds);
        }
        else if (seconds > 59){
            hour = seconds / 3600;
            minutes = seconds / 60;
            seconds = seconds % 60;
            System.out.printf("%d:%d:%d", hour, minutes, seconds);
        }
        else {
            exit(0);
        }
    }

    public int getSeconds() {
        return seconds;
    }
}
