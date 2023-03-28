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

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PaidOrder'"
    )
    public void wheneverPaidOrder_CustomerNoty(@Payload PaidOrder paidOrder) {
        PaidOrder event = paidOrder;
        System.out.println(
            "\n\n##### listener CustomerNoty : " + paidOrder + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CanceledOrder'"
    )
    public void wheneverCanceledOrder_CustomerNoty(
        @Payload CanceledOrder canceledOrder
    ) {
        CanceledOrder event = canceledOrder;
        System.out.println(
            "\n\n##### listener CustomerNoty : " + canceledOrder + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='RejectedOrder'"
    )
    public void wheneverRejectedOrder_CustomerNoty(
        @Payload RejectedOrder rejectedOrder
    ) {
        RejectedOrder event = rejectedOrder;
        System.out.println(
            "\n\n##### listener CustomerNoty : " + rejectedOrder + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ApprovedOrder'"
    )
    public void wheneverApprovedOrder_CustomerNoty(
        @Payload ApprovedOrder approvedOrder
    ) {
        ApprovedOrder event = approvedOrder;
        System.out.println(
            "\n\n##### listener CustomerNoty : " + approvedOrder + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FinishedCook'"
    )
    public void wheneverFinishedCook_CustomerNoty(
        @Payload FinishedCook finishedCook
    ) {
        FinishedCook event = finishedCook;
        System.out.println(
            "\n\n##### listener CustomerNoty : " + finishedCook + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='RegisteredDelivery'"
    )
    public void wheneverRegisteredDelivery_CustomerNoty(
        @Payload RegisteredDelivery registeredDelivery
    ) {
        RegisteredDelivery event = registeredDelivery;
        System.out.println(
            "\n\n##### listener CustomerNoty : " + registeredDelivery + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FinishedDelivery'"
    )
    public void wheneverFinishedDelivery_CustomerNoty(
        @Payload FinishedDelivery finishedDelivery
    ) {
        FinishedDelivery event = finishedDelivery;
        System.out.println(
            "\n\n##### listener CustomerNoty : " + finishedDelivery + "\n\n"
        );
        // Sample Logic //

    }
}
