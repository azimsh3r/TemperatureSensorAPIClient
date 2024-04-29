package de.client.ProjectClient;

import org.springframework.web.client.RestClient;

import java.util.List;

public class Client {

    public static void main(String [] args) {
        System.out.println("Starting");
        makeIt();
        System.out.println("We made it");
    }
    public static void makeIt() {
        RestClient restClient = RestClient.create("http://localhost:8080");

//        Map<String, String> sensorCreate = new HashMap<>();
//        sensorCreate.put("name", "test5");
//
//        restClient.post()
//                .uri("/sensors/registration")
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(sensorCreate)
//                .retrieve()
//                .toBodilessEntity();
//
//        Map<String, Object> addMeasurement = new HashMap<>();
//        Random random = new Random();
//
//        Sensor sensor = new Sensor();
//        sensor.setName("test5");
//
//        for (int i = 0; i < 100; i++) {
//            addMeasurement.put("value", random.nextFloat(100));
//            addMeasurement.put("raining", random.nextBoolean());
//            addMeasurement.put("sensor", sensor);
//            restClient.post()
//                    .uri("/measurements/add")
//                    .contentType(MediaType.APPLICATION_JSON)
//                    .body(addMeasurement)
//                    .retrieve()
//                    .toBodilessEntity();
//
//            addMeasurement.clear();
//        }

      List measurements = restClient.get()
              .uri("/measurements")
              .retrieve()
              .body(List.class);
    }
}
