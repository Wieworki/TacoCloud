package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller     //Indicamos que es un controlador, asi puede ser encontrada la clase por el component scanning
public class HomeController {
    @GetMapping("/")        //Este controlador toma las request de path "/"
    public String home() {
        return "home";      //Nombre de la vista retornada
    }
}
