package io.datajek.spring.basics.movierecommendersystem;

public class RecommenderImplementation {
    private final Filter filter;
    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }

    public String[] recommendMovies(String movie) {
        System.out.println("Name of the filter in use: " + filter + "\n");

        //return contentBasedFilter.getRecommendations(movie);
        return filter.getRecommendations("Movies");
    }

}
