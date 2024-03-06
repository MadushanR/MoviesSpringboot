package com.example.Assignment2.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="movies_table")

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Must not be blank")
    private String Name;
    private String Genre;
    private String Language;
    @Min(value = 10, message = "Duration must be at least 10 minutes")
    @Max(value = 300, message = "Duration must be at most 300 minutes")
    private int Duration;
    @Min( value = 1 , message = " Must be > 0" )
    private double Price;

    public Movie() {
    }

    public Movie(int id, String name, String genre, String language, int duration, double price) {
        this.id = id;
        Name = name;
        Genre = genre;
        Language = language;
        Duration = duration;
        Price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Genre='" + Genre + '\'' +
                ", Language='" + Language + '\'' +
                ", Duration=" + Duration +
                ", Price=" + Price +
                '}';
    }
}
