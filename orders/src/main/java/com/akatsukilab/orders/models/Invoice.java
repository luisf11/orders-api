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
public class Invoice  implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String invoiceId;
    private String orderId;
    private String userName;
    private Date date;
    private String totalAmmount;
    private String status;
}
