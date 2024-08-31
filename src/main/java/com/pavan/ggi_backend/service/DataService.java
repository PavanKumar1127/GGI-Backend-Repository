package com.pavan.ggi_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.ggi_backend.model.DataEntity;
import com.pavan.ggi_backend.repository.DataRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DataService {

    @Autowired
    private DataRepository dataRepository;

    public List<DataEntity> getAllData() {
        return dataRepository.findAll();
    }

    public Optional<DataEntity> getDataById(Long id) {
        return dataRepository.findById(id);
    }

    public DataEntity createData(DataEntity dataEntity) {
        return dataRepository.save(dataEntity);
    }

    public void deleteData(Long id) {
        dataRepository.deleteById(id);
    }
}
