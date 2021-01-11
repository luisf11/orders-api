package com.akatsukilab.orders.models;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class User implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String name;
    private String lastName;
    private String email;
    private String orderID;
    private String type;


    public User(String name, String lastName, String email, String orderID, String type) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.orderID = orderID;
        this.type = type;
    }

}
