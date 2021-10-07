package com.raph.mooney.demo.data.controllers.impl;

import java.util.List;
import java.util.stream.Collectors;
import com.raph.mooney.demo.data.controllers.GoOutController;
import com.raph.mooney.demo.data.entities.GoOutImpl;
import com.raph.mooney.demo.data.models.GoOutSQLModel;
import com.raph.mooney.demo.data.repositories.GoOutSQLRepositoryImpl;
import com.raph.mooney.demo.domain.entities.GoOut;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoOutControllerImpl implements GoOutController {

    final GoOutSQLRepositoryImpl repository;

    GoOutControllerImpl(GoOutSQLRepositoryImpl repository) {
        this.repository = repository;
    }

    @Override
    @GetMapping("/all")
    public List<GoOut> findAll() {
        // return List.of(new GoOutImpl(12.0, "oi", LocalDate.now()));
        final List<GoOutSQLModel> goOutModelList = repository.findAll();
        final List<GoOut> goOutList = goOutModelMapperToEntityList(goOutModelList);
        return goOutList;
    }

    @Override
    @GetMapping("/year/{year}")
    public List<GoOut> findByYear(@PathVariable int year) {
        final List<GoOutSQLModel> goOutModelList = repository.findByYear(year);
        return goOutModelMapperToEntityList(goOutModelList);
    }

    private List<GoOut> goOutModelMapperToEntityList(List<GoOutSQLModel> goOutModelList) {
        return goOutModelList.stream().map(model -> model.toEntity()).collect(Collectors.toList());
    }

    @Override
    @PostMapping("/goouts")
    public GoOut addGoOut(@RequestBody GoOutImpl goOut) {
        final GoOutSQLModel goOutModel = new GoOutSQLModel(goOut.getCost(), goOut.getDescription(), goOut.getDate());
        return repository.save(goOutModel);
    }

}
