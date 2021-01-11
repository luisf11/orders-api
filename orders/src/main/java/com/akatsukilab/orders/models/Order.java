package com.akatsukilab.orders.models;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class Order implements Serializable {
    /**
    *
    */
    private static final long serialVersionUID = 1L;
     private String orderID;
     private String status;
     private List<Product> productList;
     private Date creationDate;
     private String comments;
     private String TotalAmmount;


    public Order(String orderID, String status, List<Product> productList, Date creationDate, String comments, String TotalAmmount) {
        this.orderID = orderID;
        this.status = status;
        this.productList = productList;
        this.creationDate = creationDate;
        this.comments = comments;
        this.TotalAmmount = TotalAmmount;
    }


    
}
