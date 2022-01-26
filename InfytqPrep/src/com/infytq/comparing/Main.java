package com.infytq.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student sharma = new Student(12, 89.7f);
        Student ranjan = new Student(5, 99.4f);
        Student[] list = {sharma, ranjan};
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.marks - o2.marks);
            }
        });

        System.out.println(Arrays.toString(list));
    }

}
