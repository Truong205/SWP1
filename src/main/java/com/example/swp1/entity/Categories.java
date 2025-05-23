package com.example.swp1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Categories {
    @Id
     public int CategoryID;
     public String Name;
     public String Description;

    public Categories() {
    }

    public Categories(int categoryID, String name, String description) {
        CategoryID = categoryID;
        Name = name;
        Description = description;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
