package org.example.patientdomainservice.metadata;

import java.util.Map;

import org.example.patientdomainservice.ExtendedDocumentation;
import org.example.patientdomainservice.metadata.repository.MetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@ExtendedDocumentation("""
    === Metadata Management
    *Metadata Management* is responsible saving patient metadata and provides this data later 
    for different system components. Has the next flows:
        
    - "Setup Metadata" flow
    """)
@Service
public class MetadataManagement {

    private final MetadataRepository repository;
    @Autowired
    public MetadataManagement(MetadataRepository repository) {
        this.repository = repository;
    }

    @ExtendedDocumentation("""
                
        ==== "Setup Metadata" flow
            
        [plantuml]
        .Sequence diagram
        ----
        -> MetadataManagement : setupMetadata(1)
        MetadataManagement -> MetadataDB : update(2)
        ----
                
        (1) setupMetadata is called
                
        (2) MetadataManagement saves new metadata in MetadataDB
        """)
    public void setupMetadata(Map<String, String> metadata) {
        repository.update(metadata);
    }
}
