package com.mpcz.fmsentity.bean;

import javax.persistence.*;

@Entity(name = "Division")
@Table(name = "division")
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private long id;

    @Column(name ="code")
    private String code;

    @Column(name ="name")
    private String name;

    @Column(name ="regionId")
    private long regionId;

    public Division() {
    }

    public Division(long id, String code, String name, long regionId) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.regionId = regionId;
    }

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

    public long getRegionId() {
        return regionId;
    }

    public void setRegionId(long regionId) {
        this.regionId = regionId;
    }

    @Override
    public String toString() {
        return "Division{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", regionId=" + regionId +
                '}';
    }
}
