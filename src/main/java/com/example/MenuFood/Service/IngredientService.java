package com.example.MenuFood.Service;


import com.example.MenuFood.Model.Ingredient;
import com.example.MenuFood.Repository.IngredientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IngredientService{

    private IngredientDAO ingredientDAO;

    @Autowired
    public void setIngredientDAO(IngredientDAO ingredientDAO) {
        this.ingredientDAO = ingredientDAO;
    }

    public List<Ingredient> findAllByName(String name){
        return ingredientDAO.findAllByName(name);
    }

    public List<Ingredient> findAll(){
        return ingredientDAO.findAll();
    }
}