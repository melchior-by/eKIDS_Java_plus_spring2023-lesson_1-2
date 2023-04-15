package by.ekids.lesson6.cafe;

import java.util.Objects;

public class People implements Comparable<People> {
    private String name;
    private String familyName;
    private int age;
    private int salary;

    public People(String name, String familyName, int age, int salary) {
        this.name = name;
        this.familyName = familyName;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(People o) {
        return Integer.compare(o.getSalary(), this.salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return name.equals(people.name) && familyName.equals(people.familyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, familyName);
    }
}
