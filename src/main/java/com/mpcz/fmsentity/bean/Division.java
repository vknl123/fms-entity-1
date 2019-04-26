package com.mpcz.fmsentity.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mpcz.fmsinterface.CircleInterface;
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

    

    @JsonIgnore
    @ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name="circle_id")
    private Circle circle;

    
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

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(CircleInterface circle) {
		this.circle = (Circle)circle;
	}

    
}
