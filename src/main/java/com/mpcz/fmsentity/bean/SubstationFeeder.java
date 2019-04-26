package com.mpcz.fmsentity.bean;


import com.mpcz.fmsinterface.SubstationFeederInterface;

import javax.persistence.*;

@Entity
@Table(name = "substation_feeder")
public class SubstationFeeder implements SubstationFeederInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "substation_feeder_id")
    private long substationFeederId;

    
    @Column(name = "substation_id")
    private long substationId;

    @Column(name = "substation_feeder_name")
    private String substationFeederName;
	public long getSubstationFeederId() {
		return substationFeederId;
	}

	public void setSubstationFeederId(long substationFeederId) {
		this.substationFeederId = substationFeederId;
	}

	public long getSubstationId() {
		return substationId;
	}

	public void setSubstationId(long substationId) {
		this.substationId = substationId;
	}

	public String getSubstationFeederName() {
		return substationFeederName;
	}

	public void setSubstationFeederName(String substationFeederName) {
		this.substationFeederName = substationFeederName;
	}

	
   
    }
