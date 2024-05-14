package org.example.patientdomainservice.arrival;

import java.util.Map;

import org.example.patientdomainservice.ExtendedDocumentation;
import org.example.patientdomainservice.metadata.MetadataManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@ExtendedDocumentation("""
    === Patient Arrival Management
    *Patient Arrival Management* is responsible for the processes related to patient arrival. Has the next flows:
        
    - "Arrive Patient" flow
    """)
@Service
public class PatientArrivalManagement {

    private final MetadataManagement metadataManagement;

    @Autowired
    public PatientArrivalManagement(MetadataManagement metadataManagement) {
        this.metadataManagement = metadataManagement;
    }

    @ExtendedDocumentation("""
                
        ==== "Arrive Patient" flow
            
        [plantuml]
        .Sequence diagram
        ----
        Patient -> PAM : arrives(1)
        PAM -> MetadataManagement : setup metadata(2)
        ----
                
        (1) Patient calls arrivePatient PAM flow (see: //link to open API description)
                
        (2) PAM calls setup metadata flow of MetadataManagement
        """)
    public void arrivePatient(Map<String, String> patientMetadata) {
        metadataManagement.setupMetadata(patientMetadata);
    }
}
