package com.sipriano.marvel.base;

public abstract class Subject {

    public int marks;
    public static final int MIN_MARKS = 0;
    //Concrete method
    public int totalMarks() {
        return 100;
    }

    //Abstract method
    public abstract void teach();

}
