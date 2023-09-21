/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.assignment.controller;

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
    
    
}
