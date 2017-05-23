package io.billkoch.springintegrationexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.jdbc.JdbcPollingChannelAdapter;

import javax.sql.DataSource;

@Configuration
public class IntegrationConfig {

    @Bean
    MessageSource jdbcSource(DataSource dataSource) {
        return new JdbcPollingChannelAdapter(dataSource, "select * from people");
    }
}
