package com.example.minggu_1.model;

public class materi {
  private   String id;
    private String minggu;
    public materi(String minggu, String id,String tgl) {
        this.minggu = minggu;
        this.id = id;
        this.tgl = tgl;

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMinggu() {
        return minggu;
    }

    public void setMinggu(String minggu) {
        this.minggu = minggu;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    private String tgl;
}
