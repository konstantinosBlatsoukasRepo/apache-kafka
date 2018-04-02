# How to start kafka (create a topic, produce and consume a message)

1. download kafka [https://kafka.apache.org/downloads]
2. start zookeeper (for windows find the corresponding scripts, 
they are ending with .bat instead of .sh and the path is written with \ instead
of /):

```Shell  
bin/zookeeper-server-start.sh config/zookeeper.properties 
```

```
.\bin\windows\zookeeper-server-start.bat C:\kafka_2.11-1.0.0\config\zookeeper.properties
```

3. start kafka server

```Shell  
bin/kafka-server-start.sh config/server.properties 
```

```
.\bin\windows\kafka-server-start.bat C:\kafka_2.11-1.0.0\config\server.properties
```

4. create a topic

```Shell  
bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic my_topic 
```

```
.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic my_topic 
```
5. send a message (producer)

```Shell  
bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test
```

```
.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic my_topic
```

6. receive a message (consume)

```Shell  
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic my_topic --from-beginning
```

```
.\bin\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic my_topic --from-beginning
```