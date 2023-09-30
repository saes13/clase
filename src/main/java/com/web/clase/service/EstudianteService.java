package com.web.clase.service;


import com.web.clase.model.Estudiante;
import com.web.clase.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> listaEstudiantes()
    {
        return estudianteRepository.findAll();
    }

    public Optional<Estudiante> buscarEstudiante(int id)
    {
        return estudianteRepository.findById(id);
    }

    public Estudiante guardarEstudiante(Estudiante estudiante)
    {
        return estudianteRepository.save(estudiante);
    }

    public Estudiante actualizarEstudiante(int id, Estudiante estudiante)
    {
        Estudiante nuevoEstudiante = estudianteRepository.findById(id).orElse(null);

        nuevoEstudiante.setMatricula(estudiante.getMatricula());
        nuevoEstudiante.setNombre(estudiante.getNombre());
        nuevoEstudiante.setTelefono(estudiante.getTelefono());
        return estudianteRepository.save(nuevoEstudiante);
    }

    public void eliminarEstudiante(int id)
    {
        estudianteRepository.deleteById(id);
    }

}
