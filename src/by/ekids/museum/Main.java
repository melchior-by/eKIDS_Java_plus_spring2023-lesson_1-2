package by.ekids.museum;

public class Main {
    public static void main(String[] args) {
        Museum museum1 = new Museum("исторический #1",
                100,
                new String[]{"история", "культура"},
                Day.MONDAY);
        MuseumPrinter.setMuseum(museum1);
        MuseumPrinter.printInfo();
        //museum1.setCollectionSize(10000);
        Day[] visitDays = museum1.provideVisitDays();
        for (int i = 0; i < visitDays.length; i++) {
            if (visitDays[i] != null) {
                System.out.println(visitDays[i].getName());
            }
        }
    }
}
