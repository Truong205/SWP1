package com.example.swp1.controller;

import com.example.swp1.entity.Categories;
import com.example.swp1.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class CategoriesController {
    @Autowired
    private CategoriesService service;
    @GetMapping("/categories")
    public String showCategoriesPage(Model model){
        List<Categories> list = this.service.getAll();
        return "admin/categories/categories";
    }
    @RequestMapping("/add-categories")
    public String add(){
        return "admin/categories/add";
    }

}
