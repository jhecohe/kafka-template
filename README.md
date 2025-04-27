# Template kafka

### Comandos para ejecutar Kafka con Podman
#### Crear contenedor
<sub>podman run -d --name=kafka -p 9092:9092 apache/kafka<sub>
#### Entrar a la consola del contenedor Kafka
<sub>podman exec -it kafka /bin/bash</sub>
#### Crear un topic
<sub>./kafka-topics.sh --bootstrap-server localhost:9092 --create --topic unProgramadorNace</sub>
#### Listar los topicos creados
<sub>./kafka-topics.sh --list --bootstrap-server localhost:9092</sub>
#### Ecuchar los mensjes del provedor
<sub>./kafka-console-consumer.sh --topic unProgramadorNace --bootstrap-server localhost:9092</sub>
