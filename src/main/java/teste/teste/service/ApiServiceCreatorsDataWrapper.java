package teste.teste.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;
import teste.teste.model.TesteApiModelCreatorsDataWrapper;
import teste.teste.utils.GsonUtils;

public class ApiServiceCreatorsDataWrapper {

    private static final Logger LOG = LoggerFactory.getLogger(ApiServiceCreatorsDataWrapper.class);
    private static final String MSG_EXCEPTION = "Exception :: ";

    public static
    TesteApiModelCreatorsDataWrapper processarApiCreatorDataWrapper() {

        try {

            RestTemplate restTemplate = new RestTemplate();
            TesteApiModelCreatorsDataWrapper testeApiModelCreatorDataWrapper = GsonUtils.stringToObject(restTemplate.getForObject("https://gateway.marvel.com:443/v1/public/comics?ts=1&apikey=96c88fa24ca0e6c5fe37beb77459ddcd&hash=88fb09ca3e362e36e3f6dd10f8132ecd", String.class), TesteApiModelCreatorsDataWrapper.class);

            if (testeApiModelCreatorDataWrapper != null) {
                LOG.info("Resposta recebida");
            } else {
                LOG.info("Um erro ocorreu");
                return null;
            }

            return testeApiModelCreatorDataWrapper;
        } catch (Exception e) {
            LOG.error(MSG_EXCEPTION, e);
            throw teste.exception.ExceptionEnum.NAO_RETONA_VALOR.getException();
        }

    }



}
