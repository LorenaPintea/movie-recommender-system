package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        //ApplicationContext manages the beans and dependencies
        ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        //Use ApplicationContext to get the recommender object
        RecommenderImplementation recommenderImplementation = applicationContext.getBean(RecommenderImplementation.class);
        System.out.println(recommenderImplementation);

        //Retrieving prototype bean from application context twice
        Movie movie1 = applicationContext.getBean(Movie.class);
        System.out.println(movie1);

        Movie movie2 = applicationContext.getBean(Movie.class);
        System.out.println(movie2);

    }

}
