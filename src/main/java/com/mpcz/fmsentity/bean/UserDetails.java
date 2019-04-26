package com.mpcz.fmsentity.bean;

import javax.persistence.*;

import com.mpcz.fmsinterface.UserDetailsInterface;

import java.sql.Timestamp;
import java.util.Date;

@Entity(name = "UserDetails")
@Table(name = "user_details")
public class UserDetails implements UserDetailsInterface{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private long id;

    @Column(name ="user_name")
    private String userName;

    @Column(name ="role")
    private String role;

    @Column(name ="name")
    private String name;

    @Column(name ="designation")
    private String designation;

    @Column(name ="location_code")
    private String locationCode;

    @Column(name ="status")
    private String status;

    @Column(name ="mobile_no")
    private String mobileNo;

    @Column(name ="created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    @Column(name ="updated_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", locationCode='" + locationCode + '\'' +
                ", status='" + status + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", createdOn=" + createdOn +
                ", updatedOn=" + updatedOn +
                '}';
    }
}
