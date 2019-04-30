package com.mpcz.fmsentity.bean;

import com.mpcz.fmsinterface.RegionInterface;

import javax.persistence.*;

@Entity(name = "Region")
@Table(name = "region")
public class Region implements RegionInterface {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "discom_id")
	private String discoId;

	public Region() {
	}

	public Region(long id, String name, String discoId) {
		this.id = id;
		this.name = name;
		this.discoId = discoId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscoId() {
		return discoId;
	}

	public void setDiscoId(String discoId) {
		this.discoId = discoId;
	}

	@Override
	public String toString() {
		return "Region{" + "id=" + id + ", name='" + name + '\'' + ", discoId='" + discoId + '\'' + '}';
	}
}
