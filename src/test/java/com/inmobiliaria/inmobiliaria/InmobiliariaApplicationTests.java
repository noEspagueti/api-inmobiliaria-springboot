package com.inmobiliaria.inmobiliaria;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InmobiliariaApplicationTests {

	@Test
	void contextLoads(ApplicationContext context) {
            assertThat(context).isNotNull();
	}
        
}
