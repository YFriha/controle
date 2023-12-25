package com.example.CarService.entities;


import com.client.client_Serv.entities.Client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data

@AllArgsConstructor
@NoArgsConstructor

public class CarResponse {
    private Long id;

    private String brand;
    private String model;

    private String matricue;
    private Client client;
    
    
    public static CarResponseBuilder builder() {
        return new CarResponseBuilder();
    }

    // Other getter methods

    public static class CarResponseBuilder {
        private Long id;
        private String brand;
        private Client client;
        private String matricule;
        private String model;

        private CarResponseBuilder() {
        }

        public CarResponseBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public CarResponseBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarResponseBuilder client(Client client) {
            this.client = client;
            return this;
        }

        public CarResponseBuilder matricule(String matricule) {
            this.matricule = matricule;
            return this;
        }

        public CarResponseBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarResponse build() {
            return new CarResponse(this);
        }
    }

    private CarResponse(CarResponseBuilder builder) {
        this.id = builder.id;
        this.brand = builder.brand;
        this.client = builder.client;
//        this.matricule = builder.matricule;
        this.model = builder.model;
    }
}


