package com.example.javatest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller("baseEntityController")
@RequestMapping("/{basePath:.+}")
public class BaseEntityController {

    @PostMapping("/{id}/delete")
    public String removeEntity(@PathVariable("basePath") String basePath,
                               @PathVariable("id") Long id) {
        System.out.println("Deleting entity with ID: " + id + " from: " + basePath);
        return "redirect:/" + basePath + "/list";
    }

    @GetMapping("/list")
    public String listEntities(@PathVariable("basePath") String basePath) {
        System.out.println("Listing entities: " + basePath);
        return basePath + "/list";

    }
}
