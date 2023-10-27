package ru.gb.api.homework7;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Config {
    public static String currentDirectory = System.getProperty("user.dir");
    public static Logger logger = Logger.getLogger(Config.class.getName());
    public static String pathLog = "/src/main/java/ru/gb/api/homework7/Calculator.log";
    static {
    try
    {
        FileHandler fileHandler = new FileHandler(currentDirectory + pathLog);
        fileHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(fileHandler);
    } catch(
    IOException e)

    {
        e.printStackTrace();
    }
}}
