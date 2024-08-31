package com.pavan.ggi_backend.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pavan.ggi_backend.model.DataEntity;
import com.pavan.ggi_backend.service.DataService;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping
    public List<DataEntity> getAllData() {
        return dataService.getAllData();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DataEntity> getDataById(@PathVariable Long id) {
        return dataService.getDataById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public DataEntity createData(@Valid @RequestBody DataEntity dataEntity) {
        return dataService.createData(dataEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteData(@PathVariable Long id) {
        dataService.deleteData(id);
        return ResponseEntity.noContent().build();
    }
}
