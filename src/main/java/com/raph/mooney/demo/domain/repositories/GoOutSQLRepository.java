package com.raph.mooney.demo.domain.repositories;

import java.util.List;
import com.raph.mooney.demo.data.models.GoOutSQLModel;

public interface GoOutSQLRepository {
    List<GoOutSQLModel> findAll();

    List<GoOutSQLModel> findByYear(int year);

    GoOutSQLModel save(GoOutSQLModel goOut);
}
