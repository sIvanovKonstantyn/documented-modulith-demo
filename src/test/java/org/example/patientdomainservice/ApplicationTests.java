package org.example.patientdomainservice;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

public class ApplicationTests {
    @Test
    void writeDocumentationSnippets() {

        var modules = ApplicationModules.of(PatientDomainServiceApplication.class).verify();
        new Documenter(modules)
            .writeDocumentation();

        modules.getModuleByName("").get().getSpringBeans().get(0).getType()
    }
}
