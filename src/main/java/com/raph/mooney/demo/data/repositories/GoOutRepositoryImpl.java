package com.raph.mooney.demo.data.repositories;

import com.raph.mooney.demo.domain.repositories.GoOutRepository;

import com.raph.mooney.demo.data.models.GoOutModel;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GoOutRepositoryImpl extends MongoRepository<GoOutModel, String>, GoOutRepository {
}
