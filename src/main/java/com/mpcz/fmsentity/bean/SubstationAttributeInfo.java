package com.mpcz.fmsentity.bean;

import javax.persistence.*;

import com.mpcz.fmsinterface.SubstationAttributeInfoInterface;

import java.util.Date;

@Entity(name = "SubstationAttributeInfo")
@Table(name = "substation_attribute_info")
public class SubstationAttributeInfo implements SubstationAttributeInfoInterface {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "substation_id")
	private long substationId;

	@Column(name = "attribute_name")
	private String attributeName;

	@Column(name = "attribute_value")
	private String attributeValue;

	@Column(name = "status")
	private String status;

	@Column(name = "start_maonth")
	private String startMonth;

	@Column(name = "end_month")
	private String endMonth;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_on")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdOn;

	@Column(name = "updated_by")
	private String updatedBy;

	@Column(name = "updated_on")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedOn;

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

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStartMonth() {
		return startMonth;
	}

	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}

	public String getEndMonth() {
		return endMonth;
	}

	public void setEndMonth(String endMonth) {
		this.endMonth = endMonth;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Override
	public String toString() {
		return "SubstationAttributeInfo{" + "id=" + id + ", substationId=" + substationId + ", attributeName='"
				+ attributeName + '\'' + ", attributeValue='" + attributeValue + '\'' + ", status='" + status + '\''
				+ ", startMonth='" + startMonth + '\'' + ", endMonth='" + endMonth + '\'' + ", createdBy='" + createdBy
				+ '\'' + ", createdOn=" + createdOn + ", updatedBy='" + updatedBy + '\'' + ", updatedOn=" + updatedOn
				+ '}';
	}
}
