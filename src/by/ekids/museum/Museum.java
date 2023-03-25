package by.ekids.museum;

import by.ekids.common.Visitable;

public class Museum implements Visitable {
    private String name;
    private int collectionSize;
    private String[] departments;

    private Day dayOff;

    public Day getDayOff() {
        return dayOff;
    }

    public void setDayOff(Day dayOff) {
        this.dayOff = dayOff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCollectionSize() {
        return collectionSize;
    }

    public void setCollectionSize(int collectionSize) {
        if(collectionSize > 1000) {
            throw new MuseumException();
        }
        this.collectionSize = collectionSize;
    }

    public String[] getDepartments() {
        return departments;
    }

    public void setDepartments(String[] departments) {
        this.departments = departments;
    }

    public Museum(String name, int collectionSize, String[] departments, Day dayOff) {
        this.name = name;
        if(collectionSize > 1000) {
            throw new MuseumException();
        }
        this.collectionSize = collectionSize;
        this.departments = departments;
        this.dayOff = dayOff;
    }

    @Override
    public Day[] provideVisitDays() {
        Day[] week = Day.values();
        Day[] values = new Day[week.length];
        for (int i = 0; i < week.length; i++) {
            if(week[i] != dayOff) {
                values[i] = week[i];
            }
        }
        return values;
    }
}
