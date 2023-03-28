package fooddelivery.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "OwnerSection", url = "${api.url.OwnerSection}")
public interface OwnerOrderInfoService {
    @RequestMapping(method = RequestMethod.POST, path = "/ownerOrderInfos")
    public void orderReject(@RequestBody OwnerOrderInfo ownerOrderInfo);
}
