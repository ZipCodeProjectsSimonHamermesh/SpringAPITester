package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * Created by simonhamermesh on 3/3/16.
 */
@RestController
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    @Autowired
    private CustomerList customerList;

    @RequestMapping("/customerlist")
    public String getCustomerList(){

        RestTemplate restTemplate = new RestTemplate();
        Customer[] customer = restTemplate.getForObject("http://api.reimaginebanking.com/customers?key=2d4e2e556a3708469c4e07bdfdf0781e", Customer[].class);

        for(Customer c : customer){log.info(c.toString());}

        return Arrays.toString(customer);
    }

    @RequestMapping("/customer")
    public String getCustomer(){

        RestTemplate restTemplate = new RestTemplate();
        Customer customer = restTemplate.getForObject("http://api.reimaginebanking.com/customers/56c66be6a73e49274150745b?key=2d4e2e556a3708469c4e07bdfdf0781e", Customer.class);

        CustomerWithAddress customerWithAddress = new CustomerWithAddress(customer);
        try{customerList.save(customerWithAddress);} catch (Exception e){ return e.toString();}

        return customer.toString();
    }

    @RequestMapping("/customerByID")
    public String getCustomerByID(@RequestParam(value = "customerID")String customerID){

        String apiEndpointBeginning = "http://api.reimaginebanking.com/customers/";
        String apiEndpointEnd = "?key=2d4e2e556a3708469c4e07bdfdf0781e";

        String apiCALL = apiEndpointBeginning + customerID + apiEndpointEnd;

        RestTemplate restTemplate = new RestTemplate();
        Customer customer = restTemplate.getForObject(apiCALL, Customer.class);
        return customer.toString();
    }


}
