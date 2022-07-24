package com.empleados.apiempleados.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empleados.apiempleados.Repository.EmpleadoRepository;
import com.empleados.apiempleados.Model.EmpleadoModel;

@Service
public class EmpleadoService {
    
    @Autowired
    private EmpleadoRepository repository;

    public List<EmpleadoModel> getEmpleados(){
        return repository.findAll();
    }

    public EmpleadoModel saveEmpleado(EmpleadoModel empleado){
        return repository.save(empleado);
    }

    public boolean deleteEmpleado(Integer id){
        try {
            repository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
