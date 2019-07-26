import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import teste.teste.TesteApplication;
import teste.teste.model.*;


import static teste.teste.service.ApiServiceCharacterDataWrapper.processarApiCharacterDataWrapper;
import static teste.teste.service.ApiServiceComicDataWrapper.processarApiComicsDataWrapper;
import static teste.teste.service.ApiServiceCreatorsDataWrapper.processarApiCreatorDataWrapper;
import static teste.teste.service.ApiServiceEventDataWrapper.processarApiEventDataWrapper;
import static teste.teste.service.ApiServiceSeriesDataWrapper.processarApiSeriesDataWrapper;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = TesteApplication.class)
@ActiveProfiles("test")
public class TesteService {

    @Test
    public void validaNomePersonagem() {

        TesteApiModelCharacterDataWrapper testeApiModelCharacterDataWrapper = processarApiCharacterDataWrapper();

        for (TesteApiCharacter testeApiCharacter : testeApiModelCharacterDataWrapper.getData().getResults()) {

            // String nome = testeApiCharacter.getName();

            if (testeApiCharacter.getName().equals("3-D Man")) {

                Assert.assertEquals(testeApiCharacter.getName(), "3-D Man");

                System.out.println("Teste para validar que personagem " + testeApiCharacter.getName() + " está cadastrado passou.");

            }
        }
    }


    @Test
    public void validaTitleComics() {

        TesteApiModelComicDataWrapper testeApiModelComicDataWrapper = processarApiComicsDataWrapper();

        for (TesteApiModelComics testeApiModelComics : testeApiModelComicDataWrapper.getData().getResults() ) {

            if (testeApiModelComics.getTitle().equals("Storm (2006)")) {

                Assert.assertEquals(testeApiModelComics.getTitle(), "Storm (2006)");

                System.out.println("Teste para validar que o título " + testeApiModelComics.getTitle()+ " está cadastrado passou.");


            }
        }

    }


    @Test
    public void validaPrimeiroNomedoAutor() {

        TesteApiModelCreatorsDataWrapper testeApiModelCreatorsDataWrapper = processarApiCreatorDataWrapper();

        for (TesteApiModelCreators testeApiModelCreators : testeApiModelCreatorsDataWrapper.getData().getResults() ) {

            if (testeApiModelCreators.getId().equals("6606")) {

                Assert.assertEquals(testeApiModelCreators.getFirstName(), "A.R.K.");


            }
        }

    }

    @Test
    public void validaTituloEvento() {

        TesteApiModelEventDataWrapper  testeApiModelEventDataWrapper = processarApiEventDataWrapper();

        for (TesteApiModelEvents testeApiModelEvents :testeApiModelEventDataWrapper.getData().getResults()) {

            if (testeApiModelEvents.getTitle().equals("Acts of Vengeance!")) {

                Assert.assertEquals(testeApiModelEvents.getTitle(), "Acts of Vengeance!");

                System.out.println("Teste para validar que o título " + testeApiModelEvents.getTitle()+ " está cadastrado passou.");

            }
        }

    }



    @Test
    public void validaSerie_Negativo() {

        TesteApiModelSeriesDataWrapper  testeApiModelSeriesDataWrapper = processarApiSeriesDataWrapper();

        for (TesteApiModelEvents testeApiModelEvents :testeApiModelSeriesDataWrapper.getData().getResults()) {

            if (testeApiModelEvents.getTitle().equals("Acts of !")) {

                Assert.assertEquals(testeApiModelEvents.getTitle(), "Acts of !");

                System.out.println("Teste para validar que o título " + testeApiModelEvents.getTitle()+ " está cadastrado passou.");

            }
        }

    }


    @Test
    public void validaStories_Negativo() {

        TesteApiModelSeriesDataWrapper  testeApiModelSeriesDataWrapper = processarApiSeriesDataWrapper();

        for (TesteApiModelEvents testeApiModelEvents :testeApiModelSeriesDataWrapper.getData().getResults()) {

            if (testeApiModelEvents.getTitle().equals("Acts of !")) {

                Assert.assertEquals(testeApiModelEvents.getTitle(), "Acts of !");

                System.out.println("Teste para validar que o título " + testeApiModelEvents.getTitle()+ " está cadastrado passou.");

            }
        }

    }



}