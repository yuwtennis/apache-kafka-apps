# apache-kafka-apps

**WARNING: connectors are not working now. I will fix it as soon as possible.**

This repository includes practical examples with kafka related apps.  
It is meant for people who would like to see examples in addition to official documents.

## Before you start

### Ready to use platform

This repository provides container platform using docker.  
Feel free to use it if you do not have one.

```shell
docker compose up -d
```

### Bring your own client

This repository assumes that you have your own kafka client.  
If you do not have one download it from the [official site](https://kafka.apache.org/downloads).

## Applications

* For kafka producer, see [producer](producer/README.md)
* For kafka stream applications, see [stream](stream/GETTING_STARTED.md).
* For kafka connect manifests, see [connectors](connectors/GETTING_STARTED.md).
* For strimzi manifests, see [strimzi](strimzi/GETTING_STARTED.md).