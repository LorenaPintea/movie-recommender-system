package io.datajek.spring.basics.movierecommendersystem;


public class Movie {
    //private Logger logger = LoggerFactory.getLogger(this.getClass());
    private static int instances = 0;
    private int id;
    private String name;
    private String genre;
    private String producer;

    public Movie() {
        instances++;
        System.out.println("Movie constructor called!");
    }

    /*@PostConstruct
    private void postConstruct() {
        //Initialization code here
        logger.info("In Movie postConstruct method");
    }

    @PreDestroy
    private void preDestroy() {
        //cleanup code here
        logger.info("In Movie preDestroy method");
    }*/
    public static int getInstances() {
        return Movie.instances;
    }
}
