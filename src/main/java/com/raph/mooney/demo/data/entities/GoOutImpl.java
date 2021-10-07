package com.raph.mooney.demo.data.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.raph.mooney.demo.domain.entities.GoOut;

public class GoOutImpl implements GoOut {
    private double cost;
    private String description;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    public GoOutImpl(double cost, String description, LocalDate date) {
        this.cost = cost;
        this.description = description;
        this.date = date;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

    @Override
    public void setDate(LocalDate date) {
        this.date = date;
    }

    // @Override
    // public String toString() {
    // return "GoOut: {" + "cost=" + cost + ", description='" + description + '\'' +
    // ", date='" + date.toString()
    // + '\'' + '}';
    // }

}
