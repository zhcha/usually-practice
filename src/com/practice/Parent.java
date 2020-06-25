package com.practice;

import java.util.Objects;

public class Parent {

    int age = 10;
    String name = "";
    PracticeHashCode p = new PracticeHashCode();

    /**
     * 打印hi
     */
    int sayHi(int i, String s) {
        System.out.println("hi");
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parent)) return false;
        Parent parent = (Parent) o;
        return age == parent.age &&
                Objects.equals(name, parent.name) &&
                Objects.equals(p, parent.p);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, p);
    }
}
