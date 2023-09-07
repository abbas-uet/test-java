package com.example.test.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class MatrixApiService {
    String matrixBaseUrl = "https://matrix-client.matrix.org/_matrix/client/v3";

    @Autowired
    private WebClient.Builder webClientBuilder;

    public ResponseEntity<String> getRoomInfo(String roomId) {
        return new ResponseEntity<String>(webClientBuilder
                .baseUrl(matrixBaseUrl)
                .build()
                .get()
                .uri("/rooms/" + roomId)
                .retrieve()
                .bodyToMono(String.class).toString(), HttpStatus.OK)
    }

    public String createRoom(String roomName) {
//        // Construct the request body as needed
//        // For example, you might create a JSON object
//        // and convert it to a string using ObjectMapper
//        String requestBody = "{\"name\": \"" + roomName + "\"}";
//
//        return webClientBuilder
//                .baseUrl(matrixBaseUrl)
//                .build()
//                .post()
//                .uri("/createRoom")
//                .body(BodyInserters.fromValue(requestBody))
//                .retrieve()
//                .bodyToMono(String.class);
        return "Hello"
    }
}
