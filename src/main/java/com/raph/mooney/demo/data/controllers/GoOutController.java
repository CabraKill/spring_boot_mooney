package com.raph.mooney.demo.data.controllers;

import java.util.List;

import com.raph.mooney.demo.data.entities.GoOutImpl;
import com.raph.mooney.demo.domain.entities.GoOut;

public interface GoOutController {
    List<GoOut> findAll();

    List<GoOut> findByYear(int year);

    GoOut addGoOut(GoOutImpl goOut);
}
