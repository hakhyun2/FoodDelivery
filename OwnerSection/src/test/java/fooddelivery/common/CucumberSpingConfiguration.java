package fooddelivery.common;

import fooddelivery.OwnerSectionApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OwnerSectionApplication.class })
public class CucumberSpingConfiguration {}
