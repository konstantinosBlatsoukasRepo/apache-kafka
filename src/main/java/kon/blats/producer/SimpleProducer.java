package kon.blats.producer;

import org.apache.kafka.clients.producer.*;

import java.util.Properties;

/**
 * Created by k.blatsoukas on 4/2/2018.
 */
public class SimpleProducer implements Callback {

  public static void main(String[] args) {
    Properties props = new Properties();
    props.put("bootstrap.servers", "localhost:9092");
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
    props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

    Producer<String, String> producer = new KafkaProducer<>(props);
    ProducerRecord producerRecord = new ProducerRecord<>("my_topic", "my dummy message");
    producer.send(producerRecord);

    producer.close();
  }

  @Override
  public void onCompletion(RecordMetadata metadata, Exception exception) {

  }
}
