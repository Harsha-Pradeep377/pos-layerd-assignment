/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layerd.assignment.service.custom;

import pos.layerd.assignment.dto.CustomerDto;
import pos.layerd.assignment.service.SuperService;

/**
 *
 * @author Harsha
 */
public interface CustomerService extends SuperService{
    String addCustomer(CustomerDto customerDto) throws Exception;
}
