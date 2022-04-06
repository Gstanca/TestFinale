
package itsdevle.EsameFinale.configurazione;


import itsdevle.EsameFinale.EsameFinaleApplication;
import itsdevle.EsameFinale.model.ModelProdotto;
import itsdevle.EsameFinale.repository.ProdottoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
public class PrimoInserimento {
    private static final Logger logger= LoggerFactory.getLogger(EsameFinaleApplication.class);

    @Bean
    CommandLineRunner inserisciElementi(ProdottoRepository repository) {
        return args -> {
            SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
            Date dataDiAcquistoP1=dateFormat.parse("19-11-2022");
            Date dataDiAcquistoP2=dateFormat.parse("20-09-2015");
            Date dataDiAcquistoP3=dateFormat.parse("30-06-2020");
            Date dataDiScadenzaP1=dateFormat.parse("05-10-2023");
            Date dataDiScadenzaP2=dateFormat.parse("16-05-2021");
            Date dataDiScadenzaP3=dateFormat.parse("14-12-2020");

            ModelProdotto p1=new ModelProdotto("biscotti",3,dataDiAcquistoP1,dataDiScadenzaP1,1.4f);
            ModelProdotto p2=new ModelProdotto("pane",2,dataDiAcquistoP2,dataDiScadenzaP2,1.2f);
            ModelProdotto p3=new ModelProdotto("pomodori",10,dataDiAcquistoP3,dataDiScadenzaP3,2.3f);

            List<ModelProdotto> prodotti=new ArrayList<>();
            prodotti.add(p1);
            prodotti.add(p2);
            prodotti.add(p3);

            repository.saveAll(prodotti);
        };
    }
}
