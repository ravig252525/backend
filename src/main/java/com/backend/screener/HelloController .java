import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/")           // GET http://localhost:8080/
  public String hello() {
    return "Hello World";
  }
}
