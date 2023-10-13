package ru.gb.api.homework3;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int groupNumber;
    private String major;
    private List<Student> listStudent = new ArrayList<>();

    public int getGroupNumber() {
        return groupNumber;
    }

    public String getMajor() {
        return major;
    }

    public Group(int groupNumber, String major, List<Student> listStudent) {
        this.groupNumber = groupNumber;
        this.major = major;
        this.listStudent = listStudent;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(List<Student> listStudent) {
        this.listStudent = listStudent;
    }
}
