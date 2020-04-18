package com.tarea2.olmedo.Controller;

import com.tarea2.olmedo.Model.Fecha;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class FechaController {
    @RequestMapping(value="/fecha", method = RequestMethod.GET)
    public static String welcome(Model model){
        model.addAttribute("fecha", new Fecha());
        return "fecha";
    }

    @RequestMapping("/fecha")
    public @ResponseBody String dia(HttpServletRequest request) throws ParseException {
        int annio = Integer.parseInt(request.getParameter("annio"));
        int mes = Integer.parseInt(request.getParameter("mes"));
        int dia =Integer.parseInt( request.getParameter("dia"));

        String dateString = String.format("%d-%d-%d", annio, mes, dia);
        Date date = new SimpleDateFormat("yyyy-M-d").parse(dateString);
        String diaSemana = new SimpleDateFormat("EEEE", Locale.getDefault()).format(date);

        return "El dia de la semana fue/es/sera: "+diaSemana;

    }
}
