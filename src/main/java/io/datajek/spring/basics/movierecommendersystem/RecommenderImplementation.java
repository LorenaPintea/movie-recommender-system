package io.datajek.spring.basics.movierecommendersystem;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component()
public class RecommenderImplementation {

    private Filter filter;
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Qualifier("contentBasedFilter")
    public void setFilter(Filter filter) {
        logger.info("In RecommenderImplementation setter method..dependency injection");
        this.filter = filter;
    }

    public String[] recommendMovies(String movie) {
        System.out.println("Name of the filter in use: " + filter + "\n");

        //return contentBasedFilter.getRecommendations(movie);
        return filter.getRecommendations("Movies");
    }

    @PostConstruct
    public void postConstruct() {
        //initialization code here
        logger.info("In RecommenderImplementation postConstruct method");
    }

    @PreDestroy
    public void preDestroy() {
        //cleanup code here
        logger.info("In RecommenderImplementation preDestroy method");
    }

}
