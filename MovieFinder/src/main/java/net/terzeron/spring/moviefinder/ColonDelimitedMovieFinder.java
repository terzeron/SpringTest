package net.terzeron.spring.moviefinder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author terzeron
 */
public class ColonDelimitedMovieFinder implements MovieFinder {
    private String movieFile;

    public ColonDelimitedMovieFinder(String movieFile) {
        this.movieFile = movieFile;

    }

    @Override
    public List<Movie> findAll() {
        List<Movie> movieList = new ArrayList<Movie>();
        File file = new File(movieFile);
        boolean fileExists = file.exists();
        if (fileExists) {
            try {
                Scanner scanner = new Scanner(file);
                scanner.useDelimiter(":|\r?\n");  // Split on colon or end of line
                while (scanner.hasNext()) {
                    String title = scanner.next();
                    String director = scanner.next();
                    movieList.add(new Movie(title, director));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("not found file");
        }


        return movieList;
    }

}