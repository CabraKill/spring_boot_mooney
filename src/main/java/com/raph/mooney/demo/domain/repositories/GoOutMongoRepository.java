package com.raph.mooney.demo.domain.repositories;

import java.util.List;
import com.raph.mooney.demo.data.models.GoOutMongoModel;

public interface GoOutMongoRepository {
    List<GoOutMongoModel> findAll();

    List<GoOutMongoModel> findByYear(int year);

    List<GoOutMongoModel> findByYearAndMonth(int month);

    List<GoOutMongoModel> findByYearAndMonthAndDay(int day);

    GoOutMongoModel save(GoOutMongoModel goOut);
}
