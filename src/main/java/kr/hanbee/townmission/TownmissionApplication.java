package kr.hanbee.townmission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TownmissionApplication {

    public static void main(String[] args) {
        SpringApplication.run(TownmissionApplication.class, args);
    }

}
