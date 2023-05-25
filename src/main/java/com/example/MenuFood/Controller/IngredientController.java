package com.example.MenuFood.Controller;

import com.example.MenuFood.Model.Ingredient;
import com.example.MenuFood.Service.IngredientService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@Getter
@Setter
@NoArgsConstructor
@RequestMapping("/ingredient")
public class IngredientController {

    private IngredientService ingredientService;

    @Autowired
    public void setIngredientService(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/name")
    public List<Ingredient> getIngredientsByName(@RequestParam("name") String name) {
        return ingredientService.findAllByName(name);
    }

    @GetMapping("/all")
    public List<Ingredient> findAllIngredients(){
        return ingredientService.findAll();
    }
}
