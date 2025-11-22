package app;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.header.Header;
import org.apache.kafka.common.header.internals.RecordHeader;
import org.apache.kafka.common.serialization.StringSerializer;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Properties;

public class App {
    public static void main(String[] args) {
        String dest_topic = "test-topic";
        String msg_key = "msg";
        String msg_val = "Hello World.";

        try (
                Producer<String, String> producer =
                        new KafkaProducer<>(initProperties())){
            ProducerRecord<String, String> record =
                    new ProducerRecord<>(
                            dest_topic,
                            null,  // No preference with partition
                            msg_key,
                            msg_val,
                            initCustomHeaders()
                            );

            producer.send(record);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    private static Properties initProperties() {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("linger.ms", 1);
        props.put("key.serializer", StringSerializer.class.getName());
        props.put("value.serializer", StringSerializer.class.getName());

        return props;
    }

    private static ArrayList<Header> initCustomHeaders() {
        ArrayList<Header> headers = new ArrayList<>();
        headers.add(new RecordHeader("name",
                "Yu Watanabe".getBytes(StandardCharsets.UTF_8)));

        return headers;
    }
}
