/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.time;

/**
 *
 * @author MarcelloPerla
 */
public class Time {
    /**
     * @param Time
     */
    
    /**
     * @param minuti numero di minuti dell'oggetto Time
     */
    protected int minuti;
    
    /**
     * @param ore numero di ore dell'oggetto Time
     */
    protected int ore;
    /**
     * @param secondi numero di secondi dell'oggetto Time
     */
    protected int secondi;

    /**
     * 
     * @param secondi 
     * @return Costruisce un oggetto Time dato in ingresso il numero di secondi.
     */
    public Time(int secondi) {
        this.secondi = secondi;
    }
    /**
     * 
     * @param ore
     * @param minuti
     * @param secondi 
     * @return Costruisce un oggetto Time dato in ingresso ore, minuti e secondi.
     */

    public Time(int ore, int minuti, int secondi) {
        this.ore = ore;
        this.minuti = minuti;
        this.secondi = secondi;
    }
    
    /**
     * 
     * @param secondi 
     * @return Vengono addizionati il numero di secondi specificati.
     */
    public void addSecondi(int secondi){
       this.secondi += secondi;
    }
    
    /**
     * 
     * @return Esprime le ore, i minuti e i secondi dell'oggetto Time in secondi.
     */
    public int convertiSecondi(){
        return secondi + (60 * minuti) + (3600 * ore);
    }

    /**
     * 
     * @return Restituisce il numero di minuti
     */
    public int getMinuti() {
        return minuti;
    }

    /**
     * 
     * @return Restituisce il numero delle ore
     */
    public int getOre() {
        return ore;
    }
    
    /**
     * 
     * @return 
Restituisce il numero di secondi
     */
    public int getSecondi() {
        return secondi;
    }

    /**
     * 
     * @deprecated
     */
    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    /**
     * 
     * @deprecated
     */
    public void setOre(int ore) {
        this.ore = ore;
    }
    
    /**
     * 
     * @deprecated
     */
    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }
    
    /**
     * 
     * @return Restituisce una stringa che rappresenta l'oggetto
     */
    @Override
    public String toString() {
        return "Time{" + "minuti=" + minuti + ", ore=" + ore + ", secondi=" + secondi + '}';
    }
    
    
    
    
}
