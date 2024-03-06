package com.example.Assignment2.Service;

import com.example.Assignment2.Model.Movie;
import com.example.Assignment2.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepo;

    public void save(Movie movie){movieRepo.save(movie);}

    public List<Movie> getMovies(){return movieRepo.findAll();}

    public void deleteMovie(int id){movieRepo.deleteById(id);}

    public Movie getMovieById(int id) {
        return movieRepo.findById(id).orElse(null);
    }



}
