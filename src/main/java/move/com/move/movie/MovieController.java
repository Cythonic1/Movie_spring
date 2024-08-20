package move.com.move.movie;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/movie")
public class MovieController {
    
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/get_movies")
    public List<Movie> getMovies(){
        return movieService.getMovies();
    } 


    //TODO Make this so it save the user input and return the new movie
    @PostMapping("/add_movie")
    public Movie getMovie(@RequestBody Movie movie){
        return new Movie(1L, "The Godfather", "Francis Ford Coppola", "2h55", "Drama");
    }


    @DeleteMapping("/delete_movie/{movieId}")
    public void deleteMovie(@RequestParam Long movieId){
        //TODO
    }

    @PutMapping("/update_movie/{movieId}")
    public void updateMovie(@PathVariable Long movieId, @RequestBody Movie movie){
        //TODO
    }
    
}
