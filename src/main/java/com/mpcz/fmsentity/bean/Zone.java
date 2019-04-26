package com.mpcz.fmsentity.bean;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mpcz.fmsinterface.DivisionInterface;
import com.mpcz.fmsinterface.ZoneInterface;

import javax.persistence.*;

@Entity(name = "Zone")
@Table(name = "zone")
public class Zone implements ZoneInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @JsonIgnore
    @ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name="division_id")
    private Division division;

    @Column(name = "short_code")
    private String shortCode;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_no")
    private String phoneNo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    public DivisionInterface getDivision() {
		return division;
	}

	public void setDivision(DivisionInterface division) {
		this.division =(Division) division;
	}

	public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Zone{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", divisionId=" + division +
                ", shortCode='" + shortCode + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}
