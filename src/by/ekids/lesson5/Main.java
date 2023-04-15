package by.ekids.lesson5;

import by.ekids.ScienceOrganisation;
import by.ekids.museum.Day;
import by.ekids.museum.Museum;

public class Main {
    public static void main(String[] args) {
        // "не можем" создать экземпляр какой то абстрактной ScienceOrganisation
        // ScienceOrganisation organisation = new ScienceOrganisation(1000.5);

        //System.out.println(organisation.getBudget());
        Museum museum1 = new Museum("исторический #2",
                200,
                new String[]{"история", "культура"},
                Day.TUESDAY);
        System.out.println(museum1.getBudget());
    }
}
