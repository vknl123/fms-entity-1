package com.mpcz.fmsentity.bean;

import com.mpcz.fmsinterface.DivisionInterface;

import javax.persistence.*;

@Entity(name = "Division")
@Table(name = "division")
public class Division implements DivisionInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "circle_id")
    private long circleId;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public long getCircleId() {
        return circleId;
    }

    @Override
    public void setCircleId(long circleId) {
        this.circleId = circleId;
    }
}
