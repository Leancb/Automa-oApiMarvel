package teste.teste.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;
import teste.teste.model.TesteApiModelComicDataWrapper;
import teste.teste.model.TesteApiModelComics;
import teste.teste.utils.GsonUtils;

public class ApiServiceComicDataWrapper {

    private static final Logger LOG = LoggerFactory.getLogger(ApiServiceComicDataWrapper.class);
    private static final String MSG_EXCEPTION = "Exception :: ";

    public static
    TesteApiModelComicDataWrapper processarApiComicsDataWrapper() {

        try {

            RestTemplate restTemplate = new RestTemplate();
            TesteApiModelComicDataWrapper testeApiModelComicDataWrapper = GsonUtils.stringToObject(restTemplate.getForObject("https://gateway.marvel.com:443/v1/public/comics?ts=1&apikey=96c88fa24ca0e6c5fe37beb77459ddcd&hash=88fb09ca3e362e36e3f6dd10f8132ecd", String.class), TesteApiModelComicDataWrapper.class);

            if (testeApiModelComicDataWrapper != null) {
                LOG.info("Resposta recebida");
            } else {
                LOG.info("Um erro ocorreu");
                return null;
            }

            return testeApiModelComicDataWrapper;
        } catch (Exception e) {
            LOG.error(MSG_EXCEPTION, e);
            throw teste.exception.ExceptionEnum.NAO_RETONA_VALOR.getException();
        }

    }



}
