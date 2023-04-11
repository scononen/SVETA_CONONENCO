package org.example.homework_nr_5;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isHoliday() {
        if (this ==Weekday.SATURDAY || this == Weekday.SUNDAY)
            return true;
          return false;
    }

    public boolean isWeekday() {
        if(this != SATURDAY && this != SUNDAY)
            return true;
        return false;
    }

}
