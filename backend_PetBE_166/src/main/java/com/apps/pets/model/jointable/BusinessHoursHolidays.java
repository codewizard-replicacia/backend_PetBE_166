package com.apps.pets.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.apps.pets.model.Pet;
import com.apps.pets.model.PetCareCenter;
import com.apps.pets.model.PetOwner;
import com.apps.pets.model.Document;
import com.apps.pets.model.PetService;
import com.apps.pets.model.BusinessHours;
import com.apps.pets.model.complex.Address;
import com.apps.pets.enums.PetServiceType;
import com.apps.pets.converter.PetServiceTypeConverter;

@Entity(name = "BusinessHoursHolidays")
@Table(schema = "\"petcare\"", name = "\"BusinessHoursHolidays\"")
@Data
public class BusinessHoursHolidays{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"BhId\"")
	private Integer bhId;

    
    @Column(name = "\"Holidays\"")
    private Integer holidays;
}