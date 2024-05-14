package org.example.patientdomainservice.arrival.rest;

import java.util.Map;

import org.example.patientdomainservice.arrival.PatientArrivalManagement;
import org.example.patientdomainservice.arrival.rest.dto.PatientArrivalDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/patients/arrivals")
public class PatientArrivalV1Resource {
    private final PatientArrivalManagement patientArrivalManagement;

    @Autowired
    public PatientArrivalV1Resource(PatientArrivalManagement patientArrivalManagement) {
        this.patientArrivalManagement = patientArrivalManagement;
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody PatientArrivalDto patientArrivalDto) {
        patientArrivalManagement.arrivePatient(
            Map.of(
                "id", patientArrivalDto.id(),
                "customer", patientArrivalDto.customer(),
                "code", patientArrivalDto.code()
            )
        );

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
