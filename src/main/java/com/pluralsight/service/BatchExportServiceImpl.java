package com.pluralsight.service;

import com.pluralsight.model.BatchExport;
import com.pluralsight.repository.BatchExportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("batchExportService")
public class BatchExportServiceImpl implements BatchExportService {

    @Autowired
    private BatchExportRepository repo;

     public BatchExport save(BatchExport export){
         return repo.save(export);

    }
}

