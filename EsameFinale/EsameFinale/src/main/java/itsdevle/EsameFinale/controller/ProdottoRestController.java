package itsdevle.EsameFinale.controller;


import itsdevle.EsameFinale.EsameFinaleApplication;
import itsdevle.EsameFinale.avviso.ProdottoNontrovato;
import itsdevle.EsameFinale.model.ModelProdotto;
import itsdevle.EsameFinale.repository.ProdottoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class ProdottoRestController {

    private static final Logger logger= LoggerFactory.getLogger(EsameFinaleApplication.class);

    private ProdottoRepository repository;

    ProdottoRestController(ProdottoRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/prodotto")
    public List<ModelProdotto> readAll() {

        logger.info("prendo tutti i prodotti: ");
        return repository.findAll();
    }

    @GetMapping("/prodotto/{id}")
    public ModelProdotto readWithId(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new ProdottoNontrovato(id));
    }

   /* @GetMapping("/prodotto/{nome}")
    public List<ModelProdotto> readWithnome(@PathVariable String nome) {
        return repository.findBynome(nome);
    }

    @GetMapping("/prodotto/{quantita}")
    public List<ModelProdotto> readWithquantita(@PathVariable int quantita){
        return repository.findByquantita(quantita);

    }*/
    @DeleteMapping("/prodotto/{id}")
    void deleteProdotto(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/prodotto")
    public ModelProdotto inserisciUnNuovoProdotto(@RequestBody ModelProdotto nuovoProdotto) {
        return repository.save(nuovoProdotto);
    }
    @PutMapping("/prodotto/{id}")
    public ModelProdotto aggiornaDatiProdotto(@PathVariable Long id, @RequestBody ModelProdotto prodotto) {
        return repository.save(prodotto);

    }
    @GetMapping("/prodotto/prezzo")
    public List<ModelProdotto> ricercaprodottoconprezzo(@RequestParam(name = "min") float min,
                                                   @RequestParam(name = "max") float max) {
        return (List<ModelProdotto>) repository.findByprezzoBetween(min, max);
    }

    @PostMapping ("/caricafile")
    public  String caricaFile(@RequestParam ("file") MultipartFile file){
        String infoFile= file.getOriginalFilename() + " - "+file.getContentType();
        String conFormat = String.format("%S-%S", file.getOriginalFilename(),file.getContentType());
        logger.info((infoFile));
        logger.warn(conFormat);
        return conFormat;
    }

}
