package com.wilfred.springsession.springsession.configs;

import com.maxmind.geoip2.DatabaseReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import java.io.InputStream;

public class GeoConfig {
    @Bean
    public DatabaseReader geoDatabaseReader(@Value("classpath:GeoLite2-City.mmdb") InputStream geoInputStream)
            throws Exception {
        return new DatabaseReader.Builder(geoInputStream).build();
    }
}
