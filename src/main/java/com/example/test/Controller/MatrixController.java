package com.example.test.Controller;

import com.example.test.sevice.MatrixApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/matrix")
public class MatrixController {

    @Autowired
    private MatrixApiService matrixApiService;

    @GetMapping("/room")
    public Mono<String> getRoomInfo(@RequestParam String roomId) {
        return matrixApiService.getRoomInfo(roomId);
    }

    @PostMapping("/createRoom")
    public Mono<String> createRoom(@RequestParam String roomName) {
        return matrixApiService.createRoom(roomName);
    }
}