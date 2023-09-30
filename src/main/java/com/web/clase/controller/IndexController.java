package com.web.clase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index()
    {
        return "CRUD Simple de estudiantes para la 1ra asignación en el aula";
    }

}
