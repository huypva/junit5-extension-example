package io.github.huypva.junit5extension.dataprovider;

import java.util.Random;
import org.springframework.stereotype.Component;

/**
 * @author huypva
 */
@Component
public class ComponentB  {

  public int genId() {
    Random random = new Random();
    return random.nextInt();
  }
}
