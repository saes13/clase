package com.web.clase.controller;


import com.web.clase.model.Estudiante;
import com.web.clase.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @RequestMapping("/listaEstudiantes")
    public String listaEstudiantes(Model model)
    {
        model.addAttribute("estudiantes", estudianteService.listaEstudiantes());
        return "listaestudiante";
    }

    @RequestMapping("/crearEstudiante")
    public String crearEstudiante(Model model)
    {
        model.addAttribute("command", new Estudiante());
        return "crearestudiante";
    }

    @RequestMapping(value = "/crearEstudiante", method = RequestMethod.POST)
    public String crearEstudiante (@ModelAttribute("estudiante") Estudiante estudiante)
    {
        estudianteService.guardarEstudiante(estudiante);
        return "redirect:/listaEstudiantes";
    }

    @RequestMapping(value = "/actualizarestudiante.jsp/{id}")
    public String actualizarEstudiante(@PathVariable int id, Model model)
    {
        model.addAttribute("id", id);
        model.addAttribute("command", estudianteService.buscarEstudiante(id).orElse(null));
        return "actualizarestudiante";
    }

    @RequestMapping(value = "/actualizarestudiante.jsp/{id}", method = RequestMethod.POST)
    public String actualizarEstudiante(@PathVariable int id, @ModelAttribute("estudiante") Estudiante estudiante)
    {
        estudianteService.actualizarEstudiante(id, estudiante);
        return "redirec:/listaEstudiantes";
    }

    @RequestMapping(value = "/eliminarEstudiante/{id}")
    public String eliminarEstudiante(@PathVariable int id)
    {
        estudianteService.eliminarEstudiante(id);
        return "redirect:/listaEstudiantes";
    }

}
