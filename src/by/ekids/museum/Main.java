package by.ekids.museum;

public class Main {
    public static void main(String[] args) {
        Museum museum1 = new Museum("исторический #1",
                100,
                new String[]{"история", "культура"});
        museum1.printInfo();
    }
}
