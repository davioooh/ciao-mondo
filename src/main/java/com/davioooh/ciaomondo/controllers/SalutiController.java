package com.davioooh.ciaomondo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class SalutiController {

    @GetMapping
    public String unSaluto(
            @RequestParam(name = "nome", defaultValue = "Tizio") String nome
            , @RequestHeader("User-Agent") String userAgent
            , Model model) {
        model.addAttribute("nome", nome);
        model.addAttribute("userAgent", userAgent);
        return "ciao-mondo";
    }

    @GetMapping(params = "mio-parametro")
    public String unSalutoConParametro() {
        return "ciao-mondo-param";
    }

    @GetMapping(headers = "mio-header=test")
    public String unSalutoConHeader() {
        return "ciao-mondo-header";
    }
}
