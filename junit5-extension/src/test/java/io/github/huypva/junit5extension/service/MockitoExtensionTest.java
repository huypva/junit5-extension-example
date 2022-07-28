package io.github.huypva.junit5extension.service;

import static org.mockito.BDDMockito.given;

import io.github.huypva.junit5extension.dataprovider.ComponentB;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author huypva
 */
@ExtendWith(MockitoExtension.class)
class MockitoExtensionTest {

  @InjectMocks
  ServiceA greetUseCase;

  @Mock
  ComponentB randomIdProvider;

  @Test
  void greeting() {
    given(randomIdProvider.genId()).willReturn(1);

    String greeting = greetUseCase.greet("World");
    Assertions.assertEquals("Hello World with id 1!", greeting);
  }
}