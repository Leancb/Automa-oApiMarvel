package teste.teste.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;
import teste.teste.model.TesteApiCharacter;
import teste.teste.utils.GsonUtils;

public class ApiServiceCharacter {

    private static final Logger LOG = LoggerFactory.getLogger(ApiServiceCharacter.class);
    private static final String MSG_EXCEPTION = "Exception :: ";

    public static TesteApiCharacter processarApiCharacter() {

        try {
            RestTemplate restTemplate = new RestTemplate();
            TesteApiCharacter testeApiCharacter = GsonUtils.stringToObject(restTemplate.getForObject("https://gateway.marvel.com:443/v1/public/characters?ts=1&apikey=96c88fa24ca0e6c5fe37beb77459ddcd&hash=88fb09ca3e362e36e3f6dd10f8132ecd", String.class), TesteApiCharacter.class);

            if (testeApiCharacter.getName()!= null) {
                LOG.info("Resposta recebida");
            } else {

                System.out.println(testeApiCharacter.getName());

                LOG.info("Um erro ocorreu aqui");
                return null;
            }

            return testeApiCharacter;
        } catch (Exception e) {
            LOG.error(MSG_EXCEPTION, e);
            throw teste.exception.ExceptionEnum.NAO_RETONA_VALOR.getException();
        }

    }




}
