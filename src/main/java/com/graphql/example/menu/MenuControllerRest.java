package com.graphql.example.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/menu")
public class MenuControllerRest {

    @Autowired
    private MenuService menuService;

    @GetMapping
    @RequestMapping("/find/{menuid}")
    public Menu addDist(@PathVariable(value = "menuid") Integer menuId) {
        try {
            return menuService.findById(Long.valueOf(menuId));
        }
        catch (Exception e) {
            return null;
        }
    }

    @PostMapping
    @RequestMapping("/add")
    public Boolean addDist(@RequestBody Menu menu) {
        try {
            menuService.addNewDish(menu);
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }
}
