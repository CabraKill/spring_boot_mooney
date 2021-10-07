package com.raph.mooney.demo.data.repositories;

import com.raph.mooney.demo.domain.repositories.GoOutSQLRepository;
import com.raph.mooney.demo.data.models.GoOutSQLModel;

import org.springframework.data.repository.CrudRepository;

public interface GoOutSQLRepositoryImpl extends CrudRepository<GoOutSQLModel, Integer>, GoOutSQLRepository {
}
