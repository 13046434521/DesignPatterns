package com.jtl.designpatterns.builder;

/**
 * 作者:jtl
 * 日期:Created in 2019/1/28 11:19
 * 描述:简化的Builder模式
 * 更改:
 */

public class Person {
    private String name;//姓名
    private int age;//年龄
    private String height;//身高
    private String weight;//体重
    private String sex;//性别
    private String address;//家庭住址
    private String nation;//种族
    private String grade;//年纪
    private String clazz;//班级

//    public Person(String name, int age, String height, String weight, String sex, String address, String nation, String grade, String clazz) {
//        this.name = name;
//        this.age = age;
//        this.height = height;
//        this.weight = weight;
//        this.sex = sex;
//        this.address = address;
//        this.nation = nation;
//        this.grade = grade;
//        this.clazz = clazz;
//    }

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.height = builder.height;
        this.weight = builder.weight;
        this.sex = builder.sex;
        this.address = builder.address;
        this.nation = builder.nation;
        this.grade = builder.grade;
        this.clazz = builder.clazz;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private String name;//姓名
        private int age;//年龄
        private String height;//身高
        private String weight;//体重
        private String sex;//性别
        private String address;//家庭住址
        private String nation;//种族
        private String grade;//年纪
        private String clazz;//班级

        public Builder() {
            this.age = 0;
            this.name = "";
            this.height="150cm";
            this.weight="45kg";
            this.sex="男";
            this.address="";
            this.nation="";
            this.grade="一年级";
            this.clazz="一班";
        }

        Builder(Person person) {
            this.name = person.name;
            this.age = person.age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setHeight(String height) {
            this.height = height;
            return this;
        }

        public Builder setWeight(String weight) {
            this.weight = weight;
            return this;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setNation(String nation) {
            this.nation = nation;
            return this;
        }

        public Builder setGrade(String grade) {
            this.grade = grade;
            return this;
        }

        public Builder setClazz(String clazz) {
            this.clazz = clazz;
            return this;
        }

        public Person create() {
            return new Person(this);
        }
    }
}
