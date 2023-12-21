package com.example.FileToDbProject.CSVService;

import com.example.FileToDbProject.CSVRepositry.CustomerRepositry;
import com.example.FileToDbProject.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Service
public class CustomerService {

    @Autowired
    CustomerRepositry customerRepositry;

    public void saveCustomerData() throws IOException {

        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\rocke\\Downloads\\ScripMaster.csv"));

            while ((line=br.readLine())!=null) {
                String data[] = line.split(",");
                Customer customer = new Customer();
                customer.setExchange(data[0]);
                customer.setExchangeSegment(data[1]);
                customer.setSymbolCode(data[2]);
                customer.setTradingSymbol(data[3]);
                customer.setName(data[4]);
                customer.setLastPrice((data[5]));
                customer.setInstrument(data[6]);
                customer.setLotSize(data[7]);
                customer.setStrikePrice((data[8]));
                customer.setExpiryDate(data[9]);
                customer.setTickSize(data[10]);
                customerRepositry.save(customer);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
