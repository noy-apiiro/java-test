package com.example.javatest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller("productController")
@RequestMapping("/" + ProductController.BASE_PATH)
public class ProductController extends BaseEntityController {

    public static final String BASE_PATH = "product";

    @GetMapping("/create")
    public String createProductForm() {
        System.out.println("Displaying product creation form");
        return BASE_PATH + "/create";
    }

    @Override
    @PostMapping("/{id}/delete")
    public String removeEntity(@PathVariable("id") Long id,
                               @PathVariable("basePath") String basePath) {
        System.out.println("Deleting product with custom logic. Product ID: " + id);
        return "redirect:/" + BASE_PATH + "/list";
    }
}
