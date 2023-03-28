package fooddelivery.common;

import fooddelivery.DeliveryListApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeliveryListApplication.class })
public class CucumberSpingConfiguration {}
