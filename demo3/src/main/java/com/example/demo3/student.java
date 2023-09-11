package com.example.demo3;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student_Details")
public class student {
    int id;
    String name;
    String branch;
    String gpa;
    String DOB;

    public student(int id, String name, String branch, String GPA, String DOB) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.gpa = GPA;
        this.DOB = DOB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getGPA() {
        return gpa;
    }

    public void setGPA(String GPA) {
        this.gpa = GPA;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
}
