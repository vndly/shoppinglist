package com.mauriciotogneri.shoppinglist.model;

import android.graphics.Color;

import com.orm.SugarRecord;

import java.io.Serializable;

public class Category extends SugarRecord<Category> implements Serializable
{
    private static final long serialVersionUID = -5621512578788797213L;

    private String name;
    private String color;

    public Category()
    {
    }

    public Category(String name, String color)
    {
        this.name = name;
        this.color = color;
    }

    public String getName()
    {
        return name;
    }

    public String getColor()
    {
        return color;
    }

    public int getIntColor()
    {
        return Color.parseColor(color);
    }

    public void update(String newName, String newColor)
    {
        name = newName;
        color = newColor;

        save();
    }

    @Override
    public String toString()
    {
        return name;
    }
}