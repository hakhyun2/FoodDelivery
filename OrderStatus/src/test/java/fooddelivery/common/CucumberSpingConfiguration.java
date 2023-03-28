package fooddelivery.common;

import fooddelivery.OrderStatusApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderStatusApplication.class })
public class CucumberSpingConfiguration {}
