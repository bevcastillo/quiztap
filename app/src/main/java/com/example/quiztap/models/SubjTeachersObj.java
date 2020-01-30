package com.example.quiztap.models;

public class SubjTeachersObj {

    String teacherName, subjects;

    public SubjTeachersObj() {
    }

    public SubjTeachersObj(String teacherName, String subjects) {
        this.teacherName = teacherName;
        this.subjects = subjects;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }
}
