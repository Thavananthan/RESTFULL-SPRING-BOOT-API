package com.example.sample.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Student {
    @Id
    public ObjectId _id;
    public String  name;
    public int age;
    public String gender;

    public Student() {
    }

    public Student(ObjectId _id, String name, int age, String gender) {
        this._id = _id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
