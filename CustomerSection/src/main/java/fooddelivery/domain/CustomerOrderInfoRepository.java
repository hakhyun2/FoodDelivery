package fooddelivery.domain;

import fooddelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "customerOrderInfos",
    path = "customerOrderInfos"
)
public interface CustomerOrderInfoRepository
    extends PagingAndSortingRepository<CustomerOrderInfo, Long> {}
