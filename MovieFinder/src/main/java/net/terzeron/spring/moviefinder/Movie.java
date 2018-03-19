package net.terzeron.spring.moviefinder;

/**
 * @author terzeron
 */
public class Movie {
    private String name;
    private String director;

    public Movie(String title, String director) {
        this.name = title;
        this.director = director;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }
}
