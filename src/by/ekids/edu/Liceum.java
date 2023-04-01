package by.ekids.edu;

import by.ekids.School;
import by.ekids.common.Visitable;
import by.ekids.museum.Day;

public class Liceum extends School implements Visitable {
    @Override
    public void printCurrentActivity() {
        System.out.println("все по плану обчения, ученики ЭЛИТНО учатся");
    }

    @Override
    public void printCurrentActivity(String action) {
        System.out.println("ученики ЭЛИТНО принимают участие в событии - ");
        System.out.println(action);
    }

    @Override
    public void printCurrentActivity(String action, int participants) {
        System.out.println(action);
        System.out.println("в нем участвует " + participants + " ЭЛИТНЫХ учеников");
    }

    @Override
    public Day[] provideVisitDays() {
        return new Day[]{Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY, Day.SATURDAY};
    }
}
