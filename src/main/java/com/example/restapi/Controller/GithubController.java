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

        ResponseEntity<String> string = restTemplete.getForEntity("https://api.github.com/repos/Aachal1008/GitDashbooard/commits", String.class);
        return string;


    }

    @GetMapping("/commitstatus")
    public ResponseEntity<String> githubcontrollercommitstatus()
    {
        RestTemplate restTemplete = new RestTemplate();

        ResponseEntity<String> string = restTemplete.getForEntity("https://api.github.com/repos/mojombo/30daysoflaptops.github.io/commits/03e46e1677020f733a5c6b2e07594b5dfebed830/statuses", String.class);
        return string;


    }

    @GetMapping("/deployments")
    public ResponseEntity<String> githubcontrollerdeployments()
    {
        RestTemplate restTemplete = new RestTemplate();

        ResponseEntity<String> string = restTemplete.getForEntity("https://api.github.com/repos/mojombo/30daysoflaptops.github.io/deployments", String.class);
        return string;


    }


}
