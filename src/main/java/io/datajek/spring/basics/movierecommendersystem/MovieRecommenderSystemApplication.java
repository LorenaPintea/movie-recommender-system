package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@PropertySource("classpath:app.properties")
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        //ApplicationContext manages the beans and dependencies
        ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        //Use ApplicationContext to get the recommender object
        RecommenderImplementation recommenderImplementation = applicationContext.getBean(RecommenderImplementation.class);
        System.out.println(recommenderImplementation);

        //grab the property used in application.properties
        String favoriteMovie = recommenderImplementation.getFavoriteMovie();
        System.out.println(favoriteMovie);

    }

}
