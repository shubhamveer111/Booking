package com.example.booking.com;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class flightbooking {
    @GetMapping("/flightbooking")
    public String getData() {
        return "Please book your flight ticket";
    }
}
