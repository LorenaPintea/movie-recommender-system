package io.datajek.spring.basics.movierecommendersystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class RecommenderImplementation {

    private Filter filter;

    @Value("${recommender.implementation.favoriteMovie: hello}")
    private String favoriteMovie;

    public String getFavoriteMovie() {
        return favoriteMovie;
    }

    @Autowired
    @Qualifier("contentBasedFilter")
    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public String[] recommendMovies(String movie) {
        System.out.println("Name of the filter in use: " + filter + "\n");

        return filter.getRecommendations("Movies");
    }

}
