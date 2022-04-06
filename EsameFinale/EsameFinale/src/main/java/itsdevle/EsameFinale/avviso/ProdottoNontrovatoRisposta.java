package itsdevle.EsameFinale.avviso;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ProdottoNontrovatoRisposta {

    @ResponseBody
    @ExceptionHandler(ProdottoNontrovato.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)

    public String utenteNontrovato(ProdottoNontrovato exc) {

        return "Eccezione " + exc.getMessage();


    }
}
