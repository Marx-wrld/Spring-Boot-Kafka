## Spring-Boot-Kafka
This project demonstrates the integration of Apache Kafka for message production and consumption. It includes a REST controller to publish messages, a Kafka listener to consume messages, and configuration classes for Kafka consumers, producers, and topics. The application sends 100 messages to the "marxcode" topic on startup. 

- Run the following command in order to start the ZooKeeper service:
![Screenshot (52)](https://github.com/Marx-wrld/Spring-Boot-Kafka/assets/105711066/79a4a59e-d46f-48f0-aefc-cec458343d60)

- Run the following command in order to start the Kafka broker service:
![Screenshot (53)](https://github.com/Marx-wrld/Spring-Boot-Kafka/assets/105711066/2de58644-20dd-46d4-9931-fe11fd441feb)

- Run the following command to create a topic to store your events:
```
.\bin\kafka-topics.sh --create --topic marxcode --bootstrap-server localhost:9092
```

- Run the following command to read the events:
```
.\bin\kafka-console-consumer.sh --topic marxcode --from-beginning --bootstrap-server localhost:9092
```
