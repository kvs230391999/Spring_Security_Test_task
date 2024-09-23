package Test_Task.Vlad.Kulishov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringSecurityTeskTaskAplication {
    private static final Logger LOGGER =
            Logger.getLogger(SpringSecurityTeskTaskAplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityTeskTaskAplication.class, args);
        LOGGER.info("APP is running...");
    }
}
