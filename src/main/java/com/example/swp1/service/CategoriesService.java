package com.example.swp1.service;

import java.util.List;

import com.example.swp1.entity.Categories;

public interface  CategoriesService {
    List<Categories> getAll();
    Boolean create(Categories categories);
    Categories FindById(int CategoryID);
    Boolean update(Categories categories);
    Boolean delete(int CategoryID);


}
