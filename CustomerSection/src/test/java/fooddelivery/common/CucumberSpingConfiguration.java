package fooddelivery.common;

import fooddelivery.CustomerSectionApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomerSectionApplication.class })
public class CucumberSpingConfiguration {}
