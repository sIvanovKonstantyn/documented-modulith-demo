package org.example.patientdomainservice.metadata.repository;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class MetadataRepository {
    private Map<String, String> storage;
    public void update(Map<String, String> updates) {
        storage.putAll(updates);
    }
}
