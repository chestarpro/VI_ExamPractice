package com.company.taskA;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestA {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Вася", 18, Gender.MAN, 90.5));
        students.add(new Student("Катя", 16, Gender.WOMAN, 100.0));
        students.add(new Student("Маша", 20, Gender.WOMAN, 92.3));
        students.add(new Student("Паша", 19, Gender.MAN, 86.0));
        students.add(new Student("Саша", 17, Gender.MAN, 99.5));
        students.add(new Student("Даша", 21, Gender.WOMAN, 85.8));
        students.add(new Student("Гоша", 24, Gender.MAN, 78.6));
        students.add(new Student("Вова", 25, Gender.MAN, 85.4));
        students.add(new Student("Лёша", 23, Gender.MAN, 70.0));
        students.add(new Student("Тёма", 22, Gender.MAN, 90.5));

        students.forEach(System.out::println);
        System.out.println("----------------------");

        getNamesList(students).forEach(System.out::println);
        System.out.println("----------------------");

        getNamesListByAge(students, 20).forEach(System.out::println);
        System.out.println("----------------------");

        printAnonymously(students);
        System.out.println("----------------------");

        getNamesFirstLetterList(students).forEach(System.out::println);
    }

    public static List<String> getNamesList(List<Student> students) {
        return students
                .stream()
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    public static List<String> getNamesListByAge(List<Student> students, int minAge) {
        return students
                .stream()
                .filter(i -> i.getAge() > minAge)
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    public static void printAnonymously(List<Student> students) {
        students.forEach(i -> System.out.printf("ID: %s, Средняя оценка: %s\n",
                i.getId(), i.getAverageRating()));
    }

    public static List<String> getNamesFirstLetterList(List<Student>students) {
        return students
                .stream()
                .map(i -> i.getName().charAt(0) + "" + i.getName().length())
                .collect(Collectors.toList());
    }
}