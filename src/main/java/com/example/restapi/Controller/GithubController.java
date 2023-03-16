package com.example.restapi.Controller;
import com.example.restapi.Model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class GithubController {

    @GetMapping("/github")
    public String Github(){
        return "Hello Github";
    }

    @GetMapping("/hello")
    public ResponseEntity<String> githubcontroller()
    {
        RestTemplate restTemplete = new RestTemplate();

        ResponseEntity<String> string = restTemplete.getForEntity("https://api.github.com/users/Aachal1008/repos", String.class);
        return string;


    }

    @GetMapping("/commits")
    public ResponseEntity<String> githubcontrollercommit()
    {
        RestTemplate restTemplete = new RestTemplate();

        ResponseEntity<String> string = restTemplete.getForEntity("https://api.github.com/repos/Aachal1008/GitDashboard/commits", String.class);
        return string;


    }

    @GetMapping("/commitstatus")
    public ResponseEntity<String> githubcontrollercommitstatus()
    {
        RestTemplate restTemplete = new RestTemplate();

        ResponseEntity<String> string = restTemplete.getForEntity("https://api.github.com/repos/Aachal1008/GitDashboard/commits/fbc3dd3776856d6529c266c1b74fa3f83c374e31/status", String.class);
        return string;


    }

    @GetMapping("/deployments")
    public ResponseEntity<String> githubcontrollerdeployments()
    {
        RestTemplate restTemplete = new RestTemplate();

        ResponseEntity<String> string = restTemplete.getForEntity("https://api.github.com/repos/Aachal1008/GitDashboard/deployments", String.class);
        return string;


    }


}
