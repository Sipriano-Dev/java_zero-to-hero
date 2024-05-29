package com.sipriano.object.demo;

public class ShallowCloneExample {

    public static void main(String[] args) throws CloneNotSupportedException {

        Course course1 = new Course();
        course1.setCourseName("Programming");
        Student student = new Student("Anderson", course1);

        Student studentTest = student; //will be the same(true), point to the same variable
        System.out.println(student.equals(studentTest));

        Student student2 = (Student) student.clone(); //will be different(false), it's cloning the object
        System.out.println(student == student2);

        System.out.println(student.getCourse().equals(student2.getCourse()));
        //Will be true the same(true), since is ShallowClone Student is point to the same object dependency
        //Because it does not cloning the dependency


    }

}
