package com.pluralsight.repository;

import com.pluralsight.model.BatchExport;

public interface BatchExportRepository {
    BatchExport save(BatchExport export);
}
