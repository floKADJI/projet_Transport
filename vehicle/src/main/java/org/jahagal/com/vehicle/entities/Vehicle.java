package org.jahagal.com.vehicle.entities;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table
@AllArgsConstructor
//@UniqueConstraint()
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String code;

    private String immatriculation;

    private Integer placeNumber;

    private String marque;

    private String model;

    private Float purchasePrice;

    private Date purchase_date;

    private Double capaciteReservoir;

    private Date visiteDate;

    private Date fabricationYear;

    private boolean enable;
}
