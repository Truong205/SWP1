package com.example.swp1.controller;

import com.example.swp1.model.Product;
import com.example.swp1.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    private final ProductRepository repo;
    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }
    @GetMapping("/add-product")
    public String showAddProductForm(Model model){
        model.addAttribute("product", new Product());
        return "add-product";
    }
    @PostMapping("/add-product")
    public String addProduct(@ModelAttribute("product") Product product, BindingResult result, Model model){
        if (result.hasErrors()){
            return "add-product";
        }
        repo.save(product);
        model.addAttribute("message", "Product added successfully");
        model.addAttribute("product", new Product());
        return "add-product";
    }
}
