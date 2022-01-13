package main.java;

enum DayOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

public class SwitchEnum {
    public boolean isWeekend(DayOfWeek day) throws NoSuchDayOfWeekException {
        return switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> false;
            case SATURDAY, SUNDAY -> true;
        };
    }

//        boolean isWeekend;
//        switch (day) {
//            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
//                isWeekend = false;
//                break;
//
//            case SATURDAY, SUNDAY:
//                isWeekend = true;
//                break;
//
//            default:
//                throw new NoSuchDayOfWeekException();
//        }
//
//        return isWeekend;
//    }

    private static class NoSuchDayOfWeekException extends Throwable {
    }
}