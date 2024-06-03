package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class RecommenderImplementation {

    private Filter filter;

    @Autowired
    @Qualifier("contentBasedFilter")
    public void setFilter(Filter filter) {
        this.filter = filter;
        System.out.println("Setter method invoked...");
    }

    public String[] recommendMovies(String movie) {
        System.out.println("Name of the filter in use: " + filter + "\n");

        //return contentBasedFilter.getRecommendations(movie);
        return filter.getRecommendations("Movies");
    }

}
