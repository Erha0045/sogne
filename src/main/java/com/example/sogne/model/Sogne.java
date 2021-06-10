package com.example.sogne.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sogne")
public class Sogne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int sognekode;
    private String navn;
    private String kommune;
    private double smitteryk;
    private Date nedlukningStart;

    public Sogne() {
    }

    public Sogne(int sognekode, String navn, String kommune, double smitteryk, Date nedlukningStart) {
        this.sognekode = sognekode;
        this.navn = navn;
        this.kommune = kommune;
        this.smitteryk = smitteryk;
        this.nedlukningStart = nedlukningStart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSognekode() {
        return sognekode;
    }

    public void setSognekode(int sognekode) {
        this.sognekode = sognekode;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getKommune() {
        return kommune;
    }

    public void setKommune(String kommune) {
        this.kommune = kommune;
    }

    public double getSmitteryk() {
        return smitteryk;
    }

    public void setSmitteryk(double smitteryk) {
        this.smitteryk = smitteryk;
    }

    public Date getNedlukningStart() {
        return nedlukningStart;
    }

    public void setNedlukningStart(Date nedlukningStart) {
        this.nedlukningStart = nedlukningStart;
    }

    @Override
    public String toString() {
        return "Sogne{" +
                "id=" + id +
                ", sognekode=" + sognekode +
                ", navn='" + navn + '\'' +
                ", kommune='" + kommune + '\'' +
                ", smitteryk=" + smitteryk +
                ", nedlukningStart=" + nedlukningStart +
                '}';
    }
}
