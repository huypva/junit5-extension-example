package io.github.huypva.junit5extension.service;

import io.github.huypva.junit5extension.dataprovider.ComponentB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author huypva
 */
@Service
public class ServiceA {

  @Autowired
  ComponentB componentB;

  public String greet(String name) {
    int id = componentB.genId();
    return String.format("Hello %s with id %d!", name, id);
  }
}
