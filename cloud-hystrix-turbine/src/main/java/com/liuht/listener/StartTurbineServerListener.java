package com.liuht.listener;

import com.netflix.turbine.init.TurbineInit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Desc <p></p>
 * Package com.liuht.listener
 * Created by 刘惠涛 on 2017/5/12.
 */
@WebListener
public class StartTurbineServerListener implements ServletContextListener {
    private static final Logger logger = LoggerFactory.getLogger(StartTurbineServerListener.class);

    public StartTurbineServerListener(){

    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("Initing Turbine server");
        TurbineInit.init();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.info("Stopping Turbine server");
    }
}
