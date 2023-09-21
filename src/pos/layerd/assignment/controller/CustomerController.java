/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.assignment.controller;

import java.util.ArrayList;
import pos.layerd.assignment.dto.CustomerDto;
import pos.layerd.assignment.service.ServiceFactory;
import pos.layerd.assignment.service.custom.CustomerService;

/**
 *
 * @author Harsha
 */
public class CustomerController {
    
    CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);
    public String addCustomer(CustomerDto customerDto) throws Exception {
       return customerService.addCustomer(customerDto);
    }

    public ArrayList<CustomerDto> getAllCustomers() throws Exception {
       return customerService.getAllCustomer();
    }

    public String updateCustomer(CustomerDto customerDto) throws Exception {
        return customerService.updateCustomer(customerDto);
    }

    public CustomerDto getCustomer(String custId) throws Exception {
        return customerService.getCustomer(custId);
    }
    
    public String deleteCustomer(String id) throws Exception {
        return customerService.deleteCustomer(id);
    }
 
    
}
