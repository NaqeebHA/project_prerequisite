package feast.config;

import feast.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "feast")
public class AppConfig {

    @Bean
    public static Duck2 getDuck(Chicken3 chicken) {
        return new Duck2(chicken);
    }

    @Bean
    public static Pig4 getPig(Lamb5 lamb) {
        return new Pig4(lamb);
    }

    @Bean
    public static Horse7 getHorse(Camel8 camel) {
        return new Horse7(camel);
    }
}
