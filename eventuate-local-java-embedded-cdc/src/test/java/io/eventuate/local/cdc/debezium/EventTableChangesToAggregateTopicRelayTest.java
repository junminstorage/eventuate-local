package io.eventuate.local.cdc.debezium;


import io.eventuate.local.java.jdbckafkastore.EventuateLocalConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EventTableChangesToAggregateTopicRelayTest.EventTableChangesToAggregateTopicRelayTestConfiguration.class)
@DirtiesContext
@IntegrationTest
public class EventTableChangesToAggregateTopicRelayTest extends AbstractTopicRelayTest {

  @org.springframework.context.annotation.Configuration
  @Import({EventuateLocalConfiguration.class, EventTableChangesToAggregateTopicRelayConfiguration.class})
  @EnableAutoConfiguration
  public static class EventTableChangesToAggregateTopicRelayTestConfiguration {


  }


}
