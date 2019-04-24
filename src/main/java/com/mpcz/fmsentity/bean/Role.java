package com.mpcz.fmsentity.bean;

import com.mpcz.fmsinterface.RoleInterface;

import javax.persistence.*;

@Entity(name = "Role")
@Table(name = "role")
public class Role implements RoleInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "role")
    private String role;

    @Column(name = "priortiy")
    private String priortiy;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPriortiy() {
        return priortiy;
    }

    public void setPriortiy(String priortiy) {
        this.priortiy = priortiy;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", priortiy='" + priortiy + '\'' +
                '}';
    }
}
