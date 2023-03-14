package by.ekids.museum;

public class Museum {
    private String name;
    private int collectionSize;
    private String[] department;

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
        this.collectionSize = collectionSize;
    }

    public String[] getDepartment() {
        return department;
    }

    public void setDepartment(String[] department) {
        this.department = department;
    }

    public Museum(String name, int collectionSize, String[] department) {
        this.name = name;
        this.collectionSize = collectionSize;
        this.department = department;
    }

    public void printInfo() {
        System.out.println("музей - " + name);
        System.out.println("c размером коллекции: " + collectionSize + " экземпляров");
        System.out.println("и тематикой: ");
        for (int i = 0; i < department.length; i++) {
            System.out.print(department[i] + " ");
        }
    }
}
