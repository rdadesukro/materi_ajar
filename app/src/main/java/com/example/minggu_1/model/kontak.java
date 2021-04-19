package com.example.minggu_1.model;

public class kontak {
  private   String id;
    private String minggu;

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    private  int foto;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    private String judul;
    public kontak(String minggu, String id, String tgl, String judul,int foto) {
        this.minggu = minggu;
        this.id = id;
        this.tgl = tgl;
        this.judul = judul;
        this.foto = foto;

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
