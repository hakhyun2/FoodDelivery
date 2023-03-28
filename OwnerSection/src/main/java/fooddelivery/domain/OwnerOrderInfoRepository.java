package fooddelivery.domain;

import fooddelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "ownerOrderInfos",
    path = "ownerOrderInfos"
)
public interface OwnerOrderInfoRepository
    extends PagingAndSortingRepository<OwnerOrderInfo, Long> {}
