package com.empleados.apiempleados.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.empleados.apiempleados.Service.EmpleadoService;
import com.empleados.apiempleados.Model.EmpleadoModel;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class EmpleadoController {
    
    @Autowired
    EmpleadoService service;

    @GetMapping("/empleados")
    public List<EmpleadoModel> getEmpleados(){
        return service.getEmpleados();
    }

    @PostMapping("/nuevo-empleado")
    public ResponseEntity<?> saveEmpleado(@RequestBody EmpleadoModel empleado){
       return ResponseEntity.status(HttpStatus.CREATED).body(service.saveEmpleado(empleado));
    }

    @DeleteMapping("eliminar-empleado/{id}")
        public ResponseEntity<?> deleteEmpleado(@PathVariable("id") Integer id){
            service.deleteEmpleado(id);
            return ResponseEntity.ok().build();
    }
}
