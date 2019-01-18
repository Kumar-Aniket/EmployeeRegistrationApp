/**
 * 
 */
package com.company.employee.registration.app.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

import com.company.employee.registration.app.entities.DatabaseConnectionDetails;

/**
 * @author aniket.kumar
 * @version 1.0
 * @since 18/01/2019
 */
public class PropertyFileReader {

    /**
     * Singleton Instance
     */
    private static volatile PropertyFileReader instance;

    /**
     * Database connection configuration
     */
    private DatabaseConnectionDetails databaseConnectionDetails;
    
    private Properties properties;
    
    /**
     * Constructor
     * 
     * @throws CpmException
     */
    private PropertyFileReader() throws Exception {
        databaseConnectionDetails = new DatabaseConnectionDetails();
        databaseConnectionDetails.setHost(readValueFromProprtyFile("db.host.name"));
        
    }

    public String readValueFromProprtyFile(String configKey) throws Exception {
        String readValue = StringUtils.EMPTY;
        if (properties == null) {
            properties = readProperties();
        }
        readValue = (String) properties.get(configKey);
        return readValue;
    }

    /**
     * Instance getter
     * 
     * @return Singleton Instance
     * @throws CpmException
     */
    public static PropertyFileReader getInstance() throws Exception {
        if (instance == null) {
            synchronized (PropertyFileReader.class) {
                if (instance == null) {
                    instance = new PropertyFileReader();
                }
            }
        }
        return instance;
    }
    
    /**
     * This method Read properties from properties File
     * 
     * @return
     * @throws CpmException
     */
    public Properties readProperties() throws Exception {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Properties props = new Properties();
        InputStream resourceStream = null;
        try {
            resourceStream = loader.getResourceAsStream("dbconnection.properties");
            props.load(resourceStream);
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
            throw ioException;
        }
        finally {
            if (resourceStream != null) {
                try {
                    resourceStream.close();
                }
                catch (IOException ioException) {
                    ioException.printStackTrace();
                    throw ioException;
                }
            }
        }
        return props;
    }

}
