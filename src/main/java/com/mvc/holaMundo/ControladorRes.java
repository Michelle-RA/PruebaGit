package com.mvc.holaMundo;

import dao.IindividuoDao;
import domain.Individuo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
@Slf4j //me permite agregar log en la aplicacion
public class ControladorRes {

    @Autowired
    private IindividuoDao iindividuoDao;

    Iterable<Individuo> individuos = iindividuoDao.findAll();

    @GetMapping("/")
    public String comienzo(Model model){
        log.info("Estoy ejecutando el controlador SMVC");
        model.addAttribute("individuos", individuos);
        return "index";
    }
}
