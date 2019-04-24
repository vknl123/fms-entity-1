package com.mpcz.fmsentity.bean;


import com.mpcz.fmsinterface.SubstationFeederInterface;

import javax.persistence.*;

@Entity(name = "SubstationFdrName")
@Table(name = "substation_fdr_name")
public class SubstationFdrName implements SubstationFeederInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "substation_id")
    private long substationId;

    @Column(name = "substation_fdr_name")
    private long substationFdrName;

    @Column(name = "feeder_name")
    private String feederName;

    public long getSubstationId() {
        return substationId;
    }

    public void setSubstationId(long substationId) {
        this.substationId = substationId;
    }

    public long getSubstationFdrName() {
        return substationFdrName;
    }

    public void setSubstationFdrName(long substationFdrName) {
        this.substationFdrName = substationFdrName;
    }

    public String getFeederName() {
        return feederName;
    }

    public void setFeederName(String feederName) {
        this.feederName = feederName;
    }

    @Override
    public String toString() {
        return "SubstationFdrName{" +
                "substationId=" + substationId +
                ", substationFdrName=" + substationFdrName +
                ", feederName='" + feederName + '\'' +
                '}';
    }
}
