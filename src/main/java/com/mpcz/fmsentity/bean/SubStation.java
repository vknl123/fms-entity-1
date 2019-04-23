package com.mpcz.fmsentity.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "SubStation")
@Table(name = "substation")
public class SubStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private long id;

    @Column(name ="substation_name")
    private String substationName;

    @Column(name ="substation_code")
    private String substationCode;

    @Column(name ="power_transformer")
    private long powerTransformer;

    @Column(name ="incoming_lines")
    private long incomingLines;

    @Column(name ="zone_id")
    private long zoneId;

    @Column(name ="created_by")
    private String createdBy;

    @Column(name ="created_on")
    private Timestamp createdOn;

    @Column(name ="updated_by")
    private String updatedBy;

    @Column(name ="updated_on")
    private Timestamp updatedOn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubstationName() {
        return substationName;
    }

    public void setSubstationName(String substationName) {
        this.substationName = substationName;
    }

    public String getSubstationCode() {
        return substationCode;
    }

    public void setSubstationCode(String substationCode) {
        this.substationCode = substationCode;
    }

    public long getPowerTransformer() {
        return powerTransformer;
    }

    public void setPowerTransformer(long powerTransformer) {
        this.powerTransformer = powerTransformer;
    }

    public long getIncomingLines() {
        return incomingLines;
    }

    public void setIncomingLines(long incomingLines) {
        this.incomingLines = incomingLines;
    }

    public long getZoneId() {
        return zoneId;
    }

    public void setZoneId(long zoneId) {
        this.zoneId = zoneId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Timestamp getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        return "SubStation{" +
                "id=" + id +
                ", substationName='" + substationName + '\'' +
                ", substationCode='" + substationCode + '\'' +
                ", powerTransformer=" + powerTransformer +
                ", incomingLines=" + incomingLines +
                ", zoneId=" + zoneId +
                ", createdBy='" + createdBy + '\'' +
                ", createdOn=" + createdOn +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedOn=" + updatedOn +
                '}';
    }
}
