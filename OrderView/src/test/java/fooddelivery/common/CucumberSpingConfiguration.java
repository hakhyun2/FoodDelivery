package fooddelivery.common;

import fooddelivery.OrderViewApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderViewApplication.class })
public class CucumberSpingConfiguration {}
