package io.datajek.spring.basics.movierecommendersystem;

public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        return new String[]{"this is just a test"};
    }
}
