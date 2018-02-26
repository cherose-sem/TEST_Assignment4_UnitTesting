/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import first_semester_eksamen.Serving;

/**
 *
 * @author Cherry Rose Semeña
 */
public class ServingImpl implements Serving {
    private final String date;
    private final Time time;
    private final int amount;
    private final String typeOfWine;

    public ServingImpl(String date, Time time, int amount, String type) {
        this.date = date;
        this.time = time;
        this.amount = amount;
        this.typeOfWine = type; 
    }

    @Override public String getDate() { return this.date; }
    @Override public Time getTime() { return this.time; }
    @Override public int getAmount() { return this.amount; }
    @Override public String getTypeOfWine() { return this.typeOfWine; }

    @Override
    public String toString() {
        return "Serving{" + "date=" + date + ", time=" + time + 
                ", amt=" + amount + ", type=" + typeOfWine + '}';
    }
}
