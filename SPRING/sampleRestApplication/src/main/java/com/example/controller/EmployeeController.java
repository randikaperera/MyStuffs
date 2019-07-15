package com.example.controller;
import com.example.Model.Employee;
import com.example.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/employee")
    public Employee getDetails(){
       return employeeService.getEmployee();
    }

    @RequestMapping("/serverStatus")
    public String getServerStatus(){
        System.out.println("HELLOO+++++++++++++++++++++++++++++++++++++");
        String randomString = this.restTemplate.getForObject("http://EurekaServerApplication/backend", String.class);
        return "Server Response :: " + randomString;    }

}
