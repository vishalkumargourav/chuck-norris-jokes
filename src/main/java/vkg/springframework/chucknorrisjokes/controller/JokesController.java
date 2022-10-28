package vkg.springframework.chucknorrisjokes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vkg.springframework.chucknorrisjokes.services.JokeServiceImpl;

@Controller
public class JokesController {
    private final JokeServiceImpl jokeServiceImpl;

    public JokesController(JokeServiceImpl jokeServiceImpl) {
        this.jokeServiceImpl = jokeServiceImpl;
    }

    @RequestMapping("/getJoke")
    public String getChuckJokes(Model model){
        model.addAttribute("joke", jokeServiceImpl.getChuckNorrisQuotes());

        return "jokes/jokeTemplate";
    }
}
