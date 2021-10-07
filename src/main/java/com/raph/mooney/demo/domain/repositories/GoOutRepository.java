package com.raph.mooney.demo.domain.repositories;

import java.util.List;
import com.raph.mooney.demo.data.models.GoOutModel;

public interface GoOutRepository {
    List<GoOutModel> findAll();

    List<GoOutModel> findByYear(int year);

    List<GoOutModel> findByYearAndMonth(int month);

    List<GoOutModel> findByYearAndMonthAndDay(int day);

    GoOutModel save(GoOutModel goOut);
}
