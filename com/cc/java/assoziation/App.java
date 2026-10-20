package com.cc.java.assoziation;

import com.cc.java.tools.Helper;

public class App {
    
    public static void main(String[] args) {
     
    Customer customer = new Customer(1, "Maxine Mützerich", "Mützenhausen");

    // Helper.output(customer);
    // Helper.output(new Customer(1, "Maxine Mützerich", "Mützenhausen"));;

    customer.initOrder();
    customer.checkOrder();
       
  
       
    }

}

