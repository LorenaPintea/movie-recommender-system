package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
//@Component("CBF")
@Component
//@Qualifier("CBF")
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movieName) {
        return null;
    }
}
