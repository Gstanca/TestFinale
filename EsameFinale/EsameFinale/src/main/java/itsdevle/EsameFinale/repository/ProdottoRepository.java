package itsdevle.EsameFinale.repository;


import itsdevle.EsameFinale.model.ModelProdotto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProdottoRepository extends JpaRepository<ModelProdotto,Long> {

        List<ModelProdotto> findBynome(String nome);


        List<ModelProdotto> findByquantita(int quantita);



    List<ModelProdotto> findByprezzoBetween(float min, float max);

    List<ModelProdotto> findAllBynome(String nome);

    List<ModelProdotto> findAllByquantita(int quantita);

    List<ModelProdotto> findBydatadiacquisto(Date data);
}

