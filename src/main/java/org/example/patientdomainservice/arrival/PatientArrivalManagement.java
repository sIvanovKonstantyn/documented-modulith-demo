package org.example.patientdomainservice.arrival;

import java.util.Map;

import org.example.patientdomainservice.metadata.MatadataManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientArrivalManagement {

    private final MatadataManagement matadataManagement;

    @Autowired
    public PatientArrivalManagement(MatadataManagement matadataManagement) {
        this.matadataManagement = matadataManagement;
    }

    public void arrivePatient(Map<String, String> patientMetadata) {
        matadataManagement.setupMedatada(patientMetadata);
    }

}
