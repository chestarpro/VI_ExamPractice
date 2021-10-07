package com.company.taskA;

public class Student {
    private final Long id;
    private String name;
    private Integer age;
    private Gender gender;
    private Double averageRating;

    private static long countStudents;

    public Student(String name, Integer age, Gender gender, Double averageRating) {
        id = ++countStudents;
        this.name = name;
        this.age = age;
        this.gender = gender;
        if (averageRating < 0)
            this.averageRating = 0.0;
        else if (averageRating > 100)
            this.averageRating = 100.0;
        else this.averageRating = averageRating;
    }
    
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        if (averageRating < 0)
            this.averageRating = 0.0;
        else if (averageRating > 100)
            this.averageRating = 100.0;
        else this.averageRating = averageRating;
    }

    public static long getCountStudents() {
        return countStudents;
    }

    @Override
    public String toString() {
        return String.format(
                "Student: id = %s, name = %s, age = %s, gender = %s, average rating = %s",
                id, name, age,
                gender.toString().charAt(0) + gender.toString().substring(1).toLowerCase(),
                averageRating
        );
    }
}