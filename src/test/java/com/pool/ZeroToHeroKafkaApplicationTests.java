package com.pool;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.annotation.DirtiesContext;

@EmbeddedKafka(topics = "pvtopic", 
			   bootstrapServersProperty = "spring.kafka.bootstrap-servers",
			   brokerProperties = {"transaction.state.log.reflication.factor=1"})
@DirtiesContext
@SpringBootTest
class ZeroToHeroKafkaApplicationTests {

	@Test
	void contextLoads() {
	}

}
