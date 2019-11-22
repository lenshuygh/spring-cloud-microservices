package com.example.reservationservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class ReservationServiceApplication {

    @Bean
    CommandLineRunner commandLineRunner(ReservationRepository reservationRepository) {
        return strings ->
                Stream
                        .of("Josh", "Pieter", "Tasha", "Eric", "Susie", "Max")
                        .forEach(s -> reservationRepository.save(new Reservation(s)));
    }

    public static void main(String[] args) {
        SpringApplication.run(ReservationServiceApplication.class, args);
    }

}
