package vkg.springframework.chucknorrisjokes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vkg.springframework.chucknorrisjokes.services.JokesService;

@Controller
public class JokesController {
    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/getJoke")
    public String getChuckJokes(Model model){
        model.addAttribute("joke", jokesService.getChuckNorrisQuotes());

        return "jokes/jokeTemplate";
    }
}
