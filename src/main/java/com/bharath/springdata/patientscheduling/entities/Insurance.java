package com.bharath.springdata.patientscheduling.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Setter
@ToString
@Embeddable
public class Insurance {

    @Column(name = "provider_name")
    private String providerName;

    private Double copay;
}
