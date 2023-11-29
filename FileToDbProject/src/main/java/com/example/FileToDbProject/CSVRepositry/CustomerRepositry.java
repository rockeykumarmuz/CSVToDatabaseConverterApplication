package com.example.FileToDbProject.CSVRepositry;

import com.example.FileToDbProject.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepositry extends JpaRepository<Customer, Integer> {
}
