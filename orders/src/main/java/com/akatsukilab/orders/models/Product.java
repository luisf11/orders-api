package com.akatsukilab.orders.models;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class Product implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String name;
   private String id;
   private String description;
   private String type;
   private String price;
   private String comments;
   private String category ;
   private Date creationDate;



    public Product(String name, String id, String description, String type, String price, String comments, String category, Date creationDate) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.type = type;
        this.price = price;
        this.comments = comments;
        this.category = category;
        this.creationDate = creationDate;
    }


    
}
