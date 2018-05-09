/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

/**
 *
 * @author student
 */
public class Samochod {
    
    private String marka;
    private String nazwa;
    private int max_predkosc;
    private int cena;

    public Samochod() {
        
    }
    
    public Samochod(String marka, String nazwa, int cena) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getMax_predkosc() {
        return max_predkosc;
    }

    public void setMax_predkosc(int max_predkosc) {
        this.max_predkosc = max_predkosc;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
    
    
    
    
}
