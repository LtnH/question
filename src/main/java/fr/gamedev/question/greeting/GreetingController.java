package fr.gamedev.question.greeting;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * class controller pour la classe greeting.
 *
 * @author djer1
 */
@RestController
public class GreetingController {

  /**
   * modèle d'usage de message.
   */
  private static final String TEMPLATE = "Hello, %s!";
  /**
   * variable counter.
   */
  private final AtomicLong counter = new AtomicLong();

  /**
   * fonction gérant la route greeting de l'application.
   *
   * @param name nom de la personne
   * @return Greeting
   */
  @GetMapping("/greeting")
  public Greeting greeting(
      final @RequestParam(value = "name", defaultValue = "World")
      String name
  ) {
    return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
  }
}
