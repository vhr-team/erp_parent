package cn.ddosec.production.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author joker_dj
 * @create 2020-05-21日 15:06
 */

@Configuration
@EnableTransactionManagement
public class TransactionConfiguration {

    @Bean
    @Qualifier("transactionManager")
    public PlatformTransactionManager txManager(@Qualifier("dataSource") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}
