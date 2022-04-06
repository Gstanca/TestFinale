package itsdevle.EsameFinale.avviso;

public class ProdottoNontrovato extends RuntimeException{
    public ProdottoNontrovato(Long id){
        super("prodotto non trovato "+id);
    }


}
