package com.telusko.service;

import com.telusko.entity.Customer;
import com.telusko.repository.CustomerRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImp implements ICustomerService {

    @Autowired
    private CustomerRepo repo;


    @Override
    public String registerCustomerInfo(CustomerDto dto) {
        System.out.println(repo.getClass().getName());// proxyClass will be implemented

        Customer cx = new Customer();
        BeanUtils.copyProperties(dto, cx);
        repo.save(cx);

        return "Customer info stored in db wth id " + cx.getCxNo();
    }

    @Override
    public Iterable<Customer> fetchAllCustomers() {
        return repo.findAll();
    }

    @Override
    public String deleteDocument(String id) {

        Optional<Customer> optional = repo.findById(id);
        if (optional.isPresent()) {
            repo.deleteById(id);
            return "Document with id " + id + " is deleted";
        }
        return "There is no record with the given id to delete";
    }
}
