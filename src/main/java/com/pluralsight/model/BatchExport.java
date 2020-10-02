package com.pluralsight.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
//@Table(name="processbatch")
public class BatchExport {

    @Id
    @GeneratedValue
    //@Column(name="Id")
    private int id;

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    private String entityType;

    //@Column(name="JobName")
    private String jobName;

    //@Column(name="BatchNumber")
    private String batchNumber;

    //@Column(name="Owner")
    private String owner;

    //@Column(name="BatchState")
    private String batchState;

    //@Column(name="BatchExportState")
    private String batchExportState;

    //@Column(name="DocumentCount")
    private int documentCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBatchState() {
        return batchState;
    }

    public void setBatchState(String batchState) {
        this.batchState = batchState;
    }

    public String getBatchExportState() {
        return batchExportState;
    }

    public void setBatchExportState(String batchExportState) {
        this.batchExportState = batchExportState;
    }

    public int getDocumentCount() {
        return documentCount;
    }

    public void setDocumentCount(int documentCount) {
        this.documentCount = documentCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Date getExportDate() {
        return exportDate;
    }

    public void setExportDate(Date exportDate) {
        this.exportDate = exportDate;
    }

    public Date getExportedTime() {
        return exportedTime;
    }

    public void setExportedTime(Date exportedTime) {
        this.exportedTime = exportedTime;
    }

    private int pageCount;
    private Date exportDate;
    private Date exportedTime;


}
