/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.megafilme.logger;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.FileAppender;
import org.apache.log4j.SimpleLayout;


/**
 *
 * @author fe_li
 */
public class Logger {
    static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Logger.class);
    
    /**
     * 
     * @param msg   recebe a mensagem para ser inserida no arquivo de log
     * @param info  tipo de mensagem info=0 informação e info=1 erro
     * @throws IOException 
     */
    
     public static void gravarLog(String msg, int info) throws IOException { 
        DateFormat dfLog = new SimpleDateFormat("yyyyMMdd");
        FileAppender fileAppender = new FileAppender(new SimpleLayout(), "logs/Log" + dfLog.format(new Date()) + ".log", true);
        logger.addAppender(fileAppender);
        DateFormat df = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        if (info == 0) {
            logger.info(df.format(new Date()) + "\t" + msg);
        } else {
            logger.error(df.format(new Date()) + "\t" + msg);
        }
        logger.removeAllAppenders();
    }
    
}
