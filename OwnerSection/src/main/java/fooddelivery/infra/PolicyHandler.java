package fooddelivery.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import fooddelivery.config.kafka.KafkaProcessor;
import fooddelivery.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    OwnerOrderInfoRepository ownerOrderInfoRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PaidOrder'"
    )
    public void wheneverPaidOrder_LoadOrder(@Payload PaidOrder paidOrder) {
        PaidOrder event = paidOrder;
        System.out.println(
            "\n\n##### listener LoadOrder : " + paidOrder + "\n\n"
        );

        // Sample Logic //
        OwnerOrderInfo.loadOrder(event);
    }
}
