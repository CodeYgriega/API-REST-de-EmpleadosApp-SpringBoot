package com.empleados.apiempleados.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empleados.apiempleados.Model.EmpleadoModel;

@Repository
public interface EmpleadoRepository extends JpaRepository<EmpleadoModel, Integer>{
    
}
