/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.assignment.controller;

import pos.layerd.assignment.dto.OrderDto;
import pos.layerd.assignment.service.ServiceFactory;
import pos.layerd.assignment.service.custom.OrderService;

/**
 *
 * @author Harsha
 */
public class OrderController {
    private OrderService orderService = (OrderService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ORDER);

    public String placeOrder(OrderDto orderDto) throws Exception {
       return orderService.placeOrder(orderDto);
    }
    
}
