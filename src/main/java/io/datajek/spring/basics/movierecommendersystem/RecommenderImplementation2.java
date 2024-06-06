package io.datajek.spring.basics.movierecommendersystem;


public class RecommenderImplementation2 {

    private Filter filter;

    //constructor injection

    public RecommenderImplementation2(Filter filter) {
        super();
        this.filter = filter;
        System.out.println("Constructor invoked...");
    }

    public String[] recommendMovies(String movie) {
        System.out.println("Name of the filter in use: " + filter + "\n");

        return filter.getRecommendations("Movies");
    }

    public Filter getFilter() {
        return filter;
    }
}
