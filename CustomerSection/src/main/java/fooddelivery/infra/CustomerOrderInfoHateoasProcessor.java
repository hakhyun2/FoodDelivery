package fooddelivery.infra;

import fooddelivery.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomerOrderInfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<CustomerOrderInfo>> {

    @Override
    public EntityModel<CustomerOrderInfo> process(
        EntityModel<CustomerOrderInfo> model
    ) {
        return model;
    }
}
