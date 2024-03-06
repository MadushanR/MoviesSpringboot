package com.example.Assignment2.Controller;

import com.example.Assignment2.Model.Movie;
import com.example.Assignment2.Service.MovieService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    MovieService service;

    @GetMapping("/")
    public String action1(Movie movie) {
        return "index";
    }

    @GetMapping("/addMovie")
    public String action2(@Valid @ModelAttribute Movie movie, BindingResult result) {
        if(result.hasErrors()) {
            return "index";
        }
            service.save(movie);
            return "redirect:/getMovies";
    }

    @GetMapping("/getMovies")
    public String action3(Model model){
        List<Movie> movies = service.getMovies();
        model.addAttribute("movies", movies);
        System.out.println("List of Movies");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        return "viewmovies";
    }

    @GetMapping("/deleteMovie")
    public String action4(@RequestParam("id") int id) {
     service.deleteMovie(id);
        return "redirect:/getMovies";}

    @GetMapping("/edit")
    public String action5(@RequestParam("id") int id, Model model) {
        Movie movie = service.getMovieById(id);
        model.addAttribute("movie", movie);
        return "editmovie";
    }

    }
