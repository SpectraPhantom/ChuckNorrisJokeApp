package sfg.jokeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sfg.jokeapp.services.JokeService;

@Controller
@RequestMapping("/")
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping
    public String getJoke(Model model){
        model.addAttribute("joke",jokeService.getRandomQuote());
        return "index";
    }
}
