package com.kentbroadbent.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
class SimpleController {

    private static final Random RANDOM = new Random();

    @GetMapping("/random/{length}")
    String generateRandomString(@PathVariable("length") int length) {
        return RANDOM.ints('a', 'z' + 1)
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

}
