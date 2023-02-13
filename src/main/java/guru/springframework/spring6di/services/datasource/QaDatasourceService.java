package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class QaDatasourceService implements DatasourceService {

    @Override
    public String datasource() {
        return "qa-datasource";
    }
}
