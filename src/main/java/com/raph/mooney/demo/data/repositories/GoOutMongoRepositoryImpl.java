package com.raph.mooney.demo.data.repositories;

import com.raph.mooney.demo.domain.repositories.GoOutMongoRepository;

import com.raph.mooney.demo.data.models.GoOutMongoModel;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GoOutMongoRepositoryImpl extends MongoRepository<GoOutMongoModel, String>, GoOutMongoRepository {
}
