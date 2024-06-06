package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        //ApplicationContext manages the beans and dependencies
        ClassPathXmlApplicationContext  applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //check the beans which have been loaded
        System.out.println("\nBeans loaded:");
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

        //Use ApplicationContext to get the recommender object
        RecommenderImplementation recommenderImplementation = applicationContext.getBean("recommenderImplementation", RecommenderImplementation.class);
        System.out.println(recommenderImplementation);

        //Use ApplicationContext to get the recommender2 object
        RecommenderImplementation2 recommenderImplementation2 = applicationContext.getBean("recommenderImplementation2", RecommenderImplementation2.class);
        System.out.println(recommenderImplementation2);
        System.out.println(recommenderImplementation2.getFilter());

        //Close application context
        applicationContext.close();
    }

}
