/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author Akshay
 */
public class OrderList {
    private ArrayList<Order> orderList;

    public OrderList(){
        orderList = new ArrayList<Order>();
    }
    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public Order addOrder(){
        Order orderObject = new Order();
        orderList.add(orderObject);
        return orderObject;
    }
    public void deleteOrder(Order orderObject){
        orderList.remove(orderObject);
    }
}
