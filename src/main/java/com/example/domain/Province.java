package com.example.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Administrator on 2017/2/10 0010.
 */
@Entity
@Table(name = "PROVINCE", schema = "REPORT", catalog = "")
public class Province {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Province province = (Province) o;

        if (id != province.id) return false;
        if (name != null ? !name.equals(province.name) : province.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
