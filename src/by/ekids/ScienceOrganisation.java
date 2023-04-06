package by.ekids;

public abstract class ScienceOrganisation {
    private Double budget;

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public ScienceOrganisation(Double budget) {
        this.budget = budget;
    }

    //public abstract int getAbstractValue();


}
