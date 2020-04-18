package com.tarea2.olmedo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Alumno {
    @RequestMapping("/Alumno")
    public @ResponseBody
    String Alumno(){
        String yo = "Jose Alejandro Olmedo Araniva 00097017. Ingeniería informática. 4to Año";
        return yo;
    }
}
