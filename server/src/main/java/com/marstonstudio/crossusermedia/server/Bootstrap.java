package com.marstonstudio.crossusermedia.server;

import com.marstonstudio.crossusermedia.server.util.FileUtil;
import com.xuggle.xuggler.IContainerFormat;
import org.apache.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.Collection;
import java.util.Set;

@WebListener
public class Bootstrap implements ServletContextListener {

    private static Logger logger = Logger.getLogger(Bootstrap.class);

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        logger.info("Starting Recorder");

        FileUtil.startup(servletContextEvent.getServletContext());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        logger.info("Stopping Recorder");
    }
}
