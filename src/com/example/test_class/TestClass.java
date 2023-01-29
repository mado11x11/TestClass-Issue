package com.example.test_class;

public class TestClass {

    private Integer studentID;
    private String studentName;
    private int old;
    private String club;

    public Integer getStudentID() {
        return this.studentID;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public Integer getOld() {
        return this.old;
    }

    public String getClub() {
        return this.club;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void serOld(Integer old) {
        this.old = old;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public TestClass(Integer studentID, String studentName, Integer old, String club) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.old = old;
        this.club = club;
    }

}