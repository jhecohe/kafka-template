import java.util.HashMap;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    
    @Bean
    public NewTopic generateTopic(){

        HashMap<String, String> configs = new HashMap<>();
        configs.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE); // Delete, Compact (Mantiene el mensaje mas actual)
        configs.put(TopicConfig.RETENTION_MS_CONFIG, "86400000"); // Tiempo de retencion de mensajes - defecto -1, osea que no los borra - Ej 1 dia
        configs.put(TopicConfig.SEGMENT_BYTES_CONFIG, "1073741824"); // Tamanio maximo del segmento - Defecto 1GB
        configs.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, "1000012"); // Tamanio maximo de cada mensaje - Defecto 1MB

        return TopicBuilder.name("unProgramadorNace")
            .partitions(2)
            .replicas(2)
            .configs(configs)
            .build();
    }
}
