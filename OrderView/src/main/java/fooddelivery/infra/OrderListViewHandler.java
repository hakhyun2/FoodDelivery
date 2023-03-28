package fooddelivery.infra;

import fooddelivery.config.kafka.KafkaProcessor;
import fooddelivery.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class OrderListViewHandler {

    @Autowired
    private OrderListRepository orderListRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenPaidOrder_then_CREATE_1(@Payload PaidOrder paidOrder) {
        try {
            if (!paidOrder.validate()) return;

            // view 객체 생성
            OrderList orderList = new OrderList();
            // view 객체에 이벤트의 Value 를 set 함
            orderList.setId(paidOrder.getId());
            orderList.setName(paidOrder.getName());
            orderList.setTelno(paidOrder.getTelno());
            orderList.setAddress(paidOrder.getAddress());
            orderList.setMenu(String.valueOf(paidOrder.getMenu()));
            // view 레파지 토리에 save
            orderListRepository.save(orderList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
