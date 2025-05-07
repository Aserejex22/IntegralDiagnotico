package mx.edu.utez.diagnostico9a;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HolaController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hola desde mi backend";
    }
}
