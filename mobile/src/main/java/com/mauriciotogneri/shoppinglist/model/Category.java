package com.mauriciotogneri.shoppinglist.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Category implements Serializable
{
    @PrimaryKey
    public Integer id;

    @ColumnInfo
    public String name;

    public Category(String name)
    {
        this.name = name;
    }

    public Integer id()
    {
        return id;
    }

    public String name()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return name();
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        else if ((o == null) || (getClass() != o.getClass()))
        {
            return false;
        }

        Category category = (Category) o;

        return name.equals(category.name);
    }

    @Override
    public int hashCode()
    {
        return name.hashCode();
    }
}