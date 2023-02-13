package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class DevDatasourceService implements DatasourceService {

    @Override
    public String datasource() {
        return "dev-datasource";
    }
}
