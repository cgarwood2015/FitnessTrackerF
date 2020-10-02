package com.pluralsight.repository;


import com.pluralsight.model.BatchExport;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository("exportRepository")
public class BatchExportRepositoryImpl implements BatchExportRepository{



    @PersistenceContext()
    @Qualifier("eManager")
    private EntityManager emb;

    public BatchExport save(BatchExport export){
        emb.persist(export);
        emb.flush();

        return null;
    }
}
