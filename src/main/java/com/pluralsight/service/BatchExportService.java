package com.pluralsight.service;

import com.pluralsight.model.BatchExport;
import org.springframework.stereotype.Service;

public interface BatchExportService {
    public BatchExport save(BatchExport export);
}
