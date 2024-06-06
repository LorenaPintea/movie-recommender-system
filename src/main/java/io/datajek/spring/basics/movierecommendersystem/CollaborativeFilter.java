package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        return new String[]{"CB Filter"};
    }
}
