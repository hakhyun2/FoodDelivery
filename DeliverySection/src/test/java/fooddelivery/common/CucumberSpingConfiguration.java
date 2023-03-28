package fooddelivery.common;

import fooddelivery.DeliverySectionApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeliverySectionApplication.class })
public class CucumberSpingConfiguration {}
