package org.jahagal.com.vehicle.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class dto {

    private String code;

    private String immatriculation;

    private Integer place_number;

    private String marque;

    private String model;

    private Float purchase_price;

    private Date purchase_date;

    private Double capacite_reservoir;

    private Date visite_date;

    private Date fabrication_year;

    private boolean enable;
}
