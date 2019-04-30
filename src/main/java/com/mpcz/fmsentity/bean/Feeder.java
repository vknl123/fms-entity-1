package com.mpcz.fmsentity.bean;

import com.mpcz.fmsinterface.FeederInterface;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "Feeder")
@Table(name = "feeder")
public class Feeder implements FeederInterface {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fdr_id")
	private long id;

	@Column(name = "substation_id")
	private long substationId;

	@Column(name = "feeder_name")
	private String feederName;

	@Column(name = "feeder_type")
	private String feederType;

	@Column(name = "status")
	private String status;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_on")
	private Timestamp createdOn;

	@Column(name = "updated_by")
	private String updatedBy;

	@Column(name = "updated_on")
	private Timestamp updatedOn;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getSubstationId() {
		return substationId;
	}

	public void setSubstationId(long substationId) {
		this.substationId = substationId;
	}

	public String getFeederName() {
		return feederName;
	}

	public void setFeederName(String feederName) {
		this.feederName = feederName;
	}

	public String getFeederType() {
		return feederType;
	}

	public void setFeederType(String feederType) {
		this.feederType = feederType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
		return "Feeder{" + "id=" + id + ", substationId=" + substationId + ", feederName='" + feederName + '\''
				+ ", feederType='" + feederType + '\'' + ", status='" + status + '\'' + ", createdBy='" + createdBy
				+ '\'' + ", createdOn=" + createdOn + ", updatedBy='" + updatedBy + '\'' + ", updatedOn=" + updatedOn
				+ '}';
	}
}
