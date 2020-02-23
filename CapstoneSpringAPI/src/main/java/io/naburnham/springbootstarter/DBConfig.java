package io.naburnham.springbootstarter;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class DBConfig {
	@Bean(name="mysqlDatasource")
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource monitorDatasource() {
		return DataSourceBuilder.create().build();
	}
}
