package com.air.testsql.db;

import com.air.testsql.utils.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class DataSourceShow implements ApplicationContextAware {

    ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Logger.d("DataSourceShow -- setApplicationContext");
        this.applicationContext = applicationContext;
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        Logger.d("-------------------");
        Logger.d(dataSource.getClass().getName());
        Logger.d("-------------------");
    }
}
