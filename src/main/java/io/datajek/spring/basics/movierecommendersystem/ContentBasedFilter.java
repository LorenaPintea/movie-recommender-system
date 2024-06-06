package io.datajek.spring.basics.movierecommendersystem;


import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
    private static int instances = 0;
//    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private Movie movie;

    public ContentBasedFilter() {
        instances++;
        System.out.println("ContentBaseFilter constructor called!");
    }
    //@Lookup
    public Movie getMovie() {
        return movie;
    }

    public static int getInstances(){
        return ContentBasedFilter.instances;
    }

    public String[] getRecommendations(String movie) {
        return new String[]{"CBF Filter"};
    }

    /*@PostConstruct
    public void postConstruct() {
        //Initialization code here
        logger.info("In ContentBasedFilter postConstruct method");
    }

    @PreDestroy
    public void preDestroy() {
        //cleanup code here
        logger.info("In ContentBasedFilter preDestroy method");
    }*/

}
