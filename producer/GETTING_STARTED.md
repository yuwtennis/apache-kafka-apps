## Overview

This module is intended for demonstrating working example of kafka producer.  
The code used [Kafka 3.9.1 Producer](https://javadoc.io/doc/org.apache.kafka/kafka-clients/3.9.1/org/apache/kafka/clients/producer/KafkaProducer.html) for reference.

Let's start!

## Create a topic

```markdown
bin/kafka-topics.sh --create --topic test-topic --bootstrap-server localhost:9092

## Run app

```shell
gradle :producer:run
```
