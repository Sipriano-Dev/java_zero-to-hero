package com.sipriano.object.demo;

import java.util.Objects;

public class Person implements Cloneable{

    private String name;
    private int age;
    private char gender;
    private int ssn; // Social Security Number

    public Person() {

    }

    public Person(String name, int age, char gender, int ssn) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, ssn);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o; //does not need instanceOf because is the same class (above)
        return Objects.equals(name, person.getName()) && age == person.getAge()
                && gender == person.getGender() && ssn == person.getSsn();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", ssn=" + ssn +
                '}';
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();

    }

}
