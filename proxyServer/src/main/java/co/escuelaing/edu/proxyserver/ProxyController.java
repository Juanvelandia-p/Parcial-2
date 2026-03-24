package co.escuelaing.edu.proxyserver;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@RestController
public class ProxyController {

    private final String EC2_1 = "http://54.197.201.155:8080/pellseq";
    private final String EC2_2 = "http://52.90.45.205:8080/pellseq";

    private final RestTemplate restTemplate = new RestTemplate();
    private final Random random = new Random();

    @GetMapping("/pellseq")
    public String proxyTopdown(@RequestParam int value) {

        String targetUrl = random.nextBoolean() ? EC2_1 : EC2_2;

        String fullUrl = targetUrl + "?value=" + value;

        return restTemplate.getForObject(fullUrl, String.class);
    }
}
