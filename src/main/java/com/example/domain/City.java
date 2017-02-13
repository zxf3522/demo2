package com.example.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/2/10 0010.
 */
@Entity
@Table(name = "CITY", schema = "REPORT", catalog = "")
public class City {
    private byte id;
    private String name;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = false, length = 64)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @ManyToOne
    private  Province province;


    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (id != city.id) return false;
        if (name != null ? !name.equals(city.name) : city.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
