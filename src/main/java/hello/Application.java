package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Merlin on 3/29/17.
 */
@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            User user = restTemplate.getForObject(
                    "https://young-shelf-69194.herokuapp.com/user/1", User.class);
            log.info(user.toString());

//            restTemplate.postForObject(
//                    "https://young-shelf-69194.herokuapp.com/user", user, User.class);
//            log.info(user.toString());


//            Citizen citizen3 = new Citizen(user.getId(), user.getUsername());
            Citizen citizen3 = new Citizen(168, "Rick", true, "Virginia", false);
            restTemplate.postForObject(
                    "https://arcane-beyond-10759.herokuapp.com/citizen", citizen3, Citizen.class);
            log.info(citizen3.toString());
        };
    }
}