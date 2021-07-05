package com.example.minggu_1.model;

public class konta_new {
    private	int	id;
    private	String name;
    private	String phno;

    public konta_new(String name, String phno) {
        this.name = name;
        this.phno = phno;
    }

    public konta_new(int id, String name, String phno) {
        this.id = id;
        this.name = name;
        this.phno = phno;
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

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}
