/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.assignment.dao;

import pos.layerd.assignment.dao.custom.impl.CustomerDaoImpl;
import pos.layerd.assignment.dao.custom.impl.ItemDaoImpl;
import pos.layerd.assignment.dao.custom.impl.OrderDaoImpl;
import pos.layerd.assignment.dao.custom.impl.OrderDetailDaoImpl;

/**
 *
 * @author Harsha
 */
public class DaoFactory {
     private static DaoFactory daoFactory;
    
    private DaoFactory(){}
    
    public static DaoFactory getInstance(){
        if(daoFactory == null){
            daoFactory = new DaoFactory();
        }
            return daoFactory;
    }
    public SuperDao getDao(DaoType type){
        switch (type) {
            case CUSTOMER:
                return new CustomerDaoImpl();
            case ITEM:
                return new ItemDaoImpl(); 
            case ORDER:
                return new OrderDaoImpl();
            case ORDER_DETAIL:
                return new OrderDetailDaoImpl();   
            default:
                return null;
        }
    }
    public enum DaoType{
        CUSTOMER, ITEM, ORDER, ORDER_DETAIL
    }
    
}
