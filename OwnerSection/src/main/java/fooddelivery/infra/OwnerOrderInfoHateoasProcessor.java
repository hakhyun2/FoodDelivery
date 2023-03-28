package fooddelivery.infra;

import fooddelivery.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class OwnerOrderInfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<OwnerOrderInfo>> {

    @Override
    public EntityModel<OwnerOrderInfo> process(
        EntityModel<OwnerOrderInfo> model
    ) {
        return model;
    }
}
