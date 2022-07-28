package io.github.huypva.junit5extension.dataprovider;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author huypva
 */
@SpringBootTest
class ComponentBTest {

  @Autowired
  ComponentB randomIdProvider;

  @BeforeEach
  void setup() {
  }

  @Test
  void genId() {
    assertThat(randomIdProvider).isNotNull();
    assertThat(randomIdProvider.genId()).isGreaterThan(Integer.MIN_VALUE);
    assertThat(randomIdProvider.genId()).isLessThan(Integer.MAX_VALUE);
  }
}