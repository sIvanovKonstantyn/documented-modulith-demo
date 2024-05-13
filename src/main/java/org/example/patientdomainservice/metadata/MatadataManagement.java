package org.example.patientdomainservice.metadata;

import java.util.Map;

import org.example.patientdomainservice.ExtendedDocumentation;
import org.example.patientdomainservice.metadata.repository.MetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@ExtendedDocumentation("""
    [%autowidth.stretch, cols="h,a"]
    |===
    |Base package
    |`org.example.patientdomainservice.metadata`
    |Spring components
    |_Services_
        
    * `o.e.p.m.MatadataManagement`
    |===
    """)
@Service
public class MatadataManagement {

    private final MetadataRepository repository;
    @Autowired
    public MatadataManagement(MetadataRepository repository) {
        this.repository = repository;
    }

    public void setupMedatada(Map<String, String> metadata) {
        repository.update(metadata);
    }
}
