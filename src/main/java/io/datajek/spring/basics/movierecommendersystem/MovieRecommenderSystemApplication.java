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

        //RecommenderImplementation injects dependency using setter method
        System.out.println("Setter injection in RecommenderImplementation class");
        RecommenderImplementation recommender = applicationContext.getBean(RecommenderImplementation.class);

        //call method to get recommendations
        String[] result = recommender.recommendMovies("Finding Dory");

        //display results
        System.out.println(Arrays.toString(result));


        //RecommenderImplementation2 injects dependency using constructor
        //System.out.println("Constructor injection in RecommenderImplementation2 class");
        //RecommenderImplementation2 recommender2 = applicationContext.getBean(RecommenderImplementation2.class);

        //call method to get recommendations
        //result = recommender2.recommendMovies("Finding Dory");

        //display results
        //System.out.println(Arrays.toString(result));
    }

}
