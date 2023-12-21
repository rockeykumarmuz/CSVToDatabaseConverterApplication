package com.example.FileToDbProject.CSVController;

import com.example.FileToDbProject.CSVService.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(path="/feedCustomerData")
    public void setDataInDB() throws IOException {
        customerService.saveCustomerData();
    }
}
