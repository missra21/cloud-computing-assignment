package com.sap.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.cloud.config.java.ServiceScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ServiceScan
@ConfigurationProperties(prefix = "vcap.services.training-hana-schema.credentials")
public class HanaCloudConfig extends AbstractCloudConfig {
    private String host;
    private String user;
    private String password;
    private String port;
    private String schema;
    private String url;

    static final String JDBC_DRIVER = "com.sap.db.jdbc.Driver";
    private static final Logger log = LoggerFactory.getLogger(HanaCloudConfig.class);

    @Bean
    public DataSource cfDataSource() {
        try {
            Class.forName(JDBC_DRIVER);
            DataSource ds = DataSourceBuilder.create()
                    .url(url)
                    .driverClassName(JDBC_DRIVER)
                    .password(password)
                    .username(user)
                    .build();
            log.debug("DataSource : {}", ds);
            return ds;
        } catch (Exception e) {
            log.info("DataSource Bean Failed");
            log.error("Failed", e);
        }
        return null;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
