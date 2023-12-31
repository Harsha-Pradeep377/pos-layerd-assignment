/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.assignment.service.custom.impl;

import java.util.ArrayList;
import pos.layerd.assignment.dao.DaoFactory;
import pos.layerd.assignment.dao.custom.CustomerDao;
import pos.layerd.assignment.dto.CustomerDto;
import pos.layerd.assignment.entity.CustomerEntity;
import pos.layerd.assignment.service.custom.CustomerService;

/**
 *
 * @author Harsha
 */
public class CustomerServiceImpl implements CustomerService{
    
    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.CUSTOMER);

    @Override
    public String addCustomer(CustomerDto dto) throws Exception {
        CustomerEntity ce = new CustomerEntity(dto.getId(), dto.getTitle(), dto.getName(), dto.getDob(), dto.getSalary(), dto.getAddress(), dto.getCity(), dto.getProvince(), dto.getZip());
        
         if(customerDao.add(ce)){
            return "Successfully Added";
        }else{
            return "Fail";
        }
    }

    @Override
    public String updateCustomer(CustomerDto dto) throws Exception {
       CustomerEntity ce = new CustomerEntity(dto.getId(), dto.getTitle(),
                dto.getName(), dto.getDob(), dto.getSalary(),
                dto.getAddress(), dto.getCity(), dto.getProvince(),
                dto.getZip());

        if (customerDao.update(ce)) {
            return "Successfully Update";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteCustomer(String id) throws Exception {
         if (customerDao.delete(id)) {
            return "Successfully Delete";
        } else {
            return "Fail";
        }
    }

    @Override
    public CustomerDto getCustomer(String id) throws Exception {
        CustomerEntity entity = customerDao.get(id);
        return new CustomerDto(entity.getId(), entity.getTitle(),
                entity.getName(), entity.getDob(), entity.getSalary(),
                entity.getAddress(), entity.getCity(), entity.getProvince(),
                entity.getZip());
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
        ArrayList<CustomerDto>  customerDtos = new ArrayList<>();
        ArrayList<CustomerEntity> customerEntitys = customerDao.getAll();
        
        for (CustomerEntity entity : customerEntitys) {
            CustomerDto dto = new CustomerDto(entity.getId(), entity.getTitle(),
                entity.getName(), entity.getDob(), entity.getSalary(),
                entity.getAddress(), entity.getCity(), entity.getProvince(),
                entity.getZip());
            customerDtos.add(dto);
        }
        
        return customerDtos;
    }
    
}
