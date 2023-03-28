package fooddelivery.external;

import org.springframework.stereotype.Service;

@Service
public class OwnerOrderInfoServiceImpl implements OwnerOrderInfoService {

    /**
     * Fallback
     */
    public OwnerOrderInfo getOwnerOrderInfo(Long id) {
        OwnerOrderInfo ownerOrderInfo = new OwnerOrderInfo();
        return ownerOrderInfo;
    }
}
