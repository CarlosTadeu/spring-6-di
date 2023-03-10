package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class ProdDatasourceService implements DatasourceService {

    @Override
    public String datasource() {
        return "prod-datasource";
    }
}
