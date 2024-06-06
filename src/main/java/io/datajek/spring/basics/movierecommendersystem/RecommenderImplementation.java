package io.datajek.spring.basics.movierecommendersystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class RecommenderImplementation {
    @Autowired
    @Qualifier("contentBasedFilter")
    private Filter filter;
    //private Logger logger = LoggerFactory.getLogger(this.getClass());

    public RecommenderImplementation(){};
    public void setFilter(Filter filter) {
        //logger.info("In RecommenderImplementation setter method..dependency injection");
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public String[] recommendMovies(String movie) {
        System.out.println("Name of the filter in use: " + filter + "\n");

        //return contentBasedFilter.getRecommendations(movie);
        return filter.getRecommendations("Movies");
    }

    /*@PostConstruct
    public void postConstruct() {
        //initialization code here
        logger.info("In RecommenderImplementation postConstruct method");
    }

    @PreDestroy
    public void preDestroy() {
        //cleanup code here
        logger.info("In RecommenderImplementation preDestroy method");
    }*/

}
