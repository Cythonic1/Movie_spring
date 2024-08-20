package move.com.move.movie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity// ? This annotation marks the Movie class as a JPA entity, meaning it's a class that maps to a table in the database.
@Table(name = "movies")
public class Movie {
    @Id
    @SequenceGenerator(
        name = "movie_sequence", 
        sequenceName = "movie_sequence", 
        allocationSize = 1)
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE, 
        generator = "movie_sequence")
    private Long id;
    private String title;
    private String name;
    private String movieLong;
    private String moviesCatigory;

    public Movie(Long id, String title, String name, String movieLong, String moviesCatigory) {
        this.id = id;
        this.title = title;
        this.name = name;
        this.movieLong = movieLong;
        this.moviesCatigory = moviesCatigory;
    }
    public Movie(String title, String name, String movieLong, String moviesCatigory) {
        this.title = title;
        this.name = name;
        this.movieLong = movieLong;
        this.moviesCatigory = moviesCatigory;
    }

    public Movie(){

    }
    
    public Long getMovieId() {
        return id;
    }

    public void setMovieId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovieLong() {
        return movieLong;
    }

    public void setMovieLong(String movieLong) {
        this.movieLong = movieLong;
    }

    public String getMoviesCatigory() {
        return moviesCatigory;
    }

    public void setMoviesCatigory(String moviesCatigory) {
        this.moviesCatigory = moviesCatigory;
    }

}


/**
 * In Java, when working with JPA and Hibernate 
 * (the default JPA implementation in Spring Boot), 
 * entities need to have a default (no-argument) constructor. 
 * The reason for this requirement is that JPA uses reflection to create instances 
 * of the entity classes. Without a default constructor, 
 * JPA can't instantiate the entity, 
 * which leads to the error you encountered.
 */
// ? The above meaning that the JPA will crate and empty object. 
// ? then it will use the setters to add the values.
