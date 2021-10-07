package com.raph.mooney.demo.data.models;

import java.time.LocalDate;

import com.raph.mooney.demo.data.entities.GoOutImpl;
import com.raph.mooney.demo.domain.entities.GoOut;

import org.springframework.data.annotation.Id;

public class GoOutModel implements GoOut {
    @Id
    private String id;
    private double cost;
    private String description;
    private int year;
    private int month;
    private int day;

    public GoOutModel() {
    }

    public GoOutModel(double cost, String description, LocalDate date) {
        this.cost = cost;
        this.description = description;
        this.year = date.getYear();
        this.month = date.getMonthValue();
        this.day = date.getDayOfMonth();
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public LocalDate getDate() {
        return dateFactory(year, month, day);
    }

    private LocalDate dateFactory(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        return date;
    }

    public GoOut toEntity() {
        GoOut goOut = new GoOutImpl(cost, description, getDate());
        return goOut;
    }

    @Override
    public void setCost(double cost) {
        this.cost = cost;

    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setDate(LocalDate date) {
        this.year = date.getYear();
        this.month = date.getMonthValue();
        this.day = date.getDayOfMonth();
    }
}
