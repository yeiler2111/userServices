package edu.unimagdalena.microg2;

import org.testcontainers.containers.PostgreSQLContainer;

//@TestConfiguration(proxyBeanMethods = false)
public class TestContainersConfig {
    //@Bean
    //@ServiceConnection
    PostgreSQLContainer<?> postgreSQLContainer(){
        return new PostgreSQLContainer<>("postgresD:15-alpine");
    }
}
