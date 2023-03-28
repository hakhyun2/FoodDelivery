package fooddelivery.common;

import fooddelivery.CustomerNotySectionApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomerNotySectionApplication.class })
public class CucumberSpingConfiguration {}
