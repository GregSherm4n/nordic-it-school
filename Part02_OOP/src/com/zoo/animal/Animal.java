package com.zoo.animal;

public abstract class Animal {

    private String kind;
    private String name;
    private Integer age;
    private Float isHungry;

    public Animal() {

    }

    public Animal(String name, Integer age, Float isHungry) {
        this.name = name;
        this.age = age;
        this.isHungry = isHungry;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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

    public Float getIsHungry() {
        return isHungry;
    }

    public void setIsHungry(Float isHungry) {
        this.isHungry = isHungry;
    }

    public abstract void say();

}
