package org.example.patientdomainservice;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.svosh.open.documenter.ExtendedDocumenter;

public class ApplicationDocumentationTest {
    @Test
    void checkStructureAndWriteApplicationDocumentation() {
        var modules = ApplicationModules.of(PatientDomainServiceApplication.class).verify();
        new ExtendedDocumenter("Modulith application(demo)", modules)
            .writeDocumentation()
            .moveToFolder("documentation");
    }
}
