package vkg.springframework.chucknorrisjokes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vkg.springframework.chucknorrisjokes.services.JokeService;
import vkg.springframework.chucknorrisjokes.services.JokeServiceImpl;

@Controller
public class JokesController {
    private final JokeService jokeService;

    public JokesController(JokeService jokeServiceImpl) {
        this.jokeService = jokeServiceImpl;
    }

    @RequestMapping("/getJoke")
    public String getChuckJokes(Model model){
        model.addAttribute("joke", jokeService.getChuckNorrisQuotes());

        return "jokes/jokeTemplate";
    }
}
