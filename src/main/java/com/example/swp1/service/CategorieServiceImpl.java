package com.example.swp1.service;
import java.util.List;
import com.example.swp1.entity.Categories;
import com.example.swp1.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieServiceImpl implements CategoriesService {
    @Autowired
    private CategoriesRepository repo;

    @Override
    public List<Categories> getAll() {
        return this.repo.findAll();
    }

    @Override
    public Boolean create(Categories categories) {
        try {
            this.repo.save(categories);
            return true;
        } catch (Exception e) {
           e.printStackTrace();
        }
        return false;
    }

    @Override
    public Categories FindById(int CategoryID) {
        return null;
    }

    @Override
    public Boolean update(Categories categories) {
        return null;
    }

    @Override
    public Boolean delete(int CategoryID) {
        return null;
    }
}
