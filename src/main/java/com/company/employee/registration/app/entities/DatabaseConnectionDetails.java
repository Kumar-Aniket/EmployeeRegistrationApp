/**
 * Copyright (c) Koninklijke Philips Electronics N.V. 2016 All rights are
 * reserved. Reproduction or transmission in whole or in part, in any form or by
 * any means, electronic, mechanical or otherwise, is prohibited without the
 * prior written consent of the copyright owner.
 * ============================================================ FILENAME:
 * DatabaseConnectionDetails.java
 */
package com.company.employee.registration.app.entities;

/**
 * @author aniket.kumar
 * @version 1.0
 * @since 18/01/2019
 */
public class DatabaseConnectionDetails {

    /**
     * DataBase HostName
     */
    private String host;

    /**
     * DataBase Port
     */
    private String port;

    /**
     * DataBase Name
     */
    private String databaseName;

    /**
     * DataBase User Name
     */
    private String userName;

    /**
     * DataBase Password
     */
    private String password;

    /**
     * DataBase Schema name
     */
    private String schema;

    /**
     * DataBase Connection String
     */
    private String connectionString;

    /**
     * Database uri for connection
     */
    private String dbUri;

    /**
     * @return the host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host
     *            the host to set
     */
    public void setHost(String host) {

        this.host = host;
    }

    /**
     * @return the port
     */
    public String getPort() {
        return port;
    }

    /**
     * @param port
     *            the port to set
     */
    public void setPort(String port) {

        this.port = port;
    }

    /**
     * @return the databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * @param databaseName
     *            the databaseName to set
     */
    public void setDatabaseName(String databaseName) {

        this.databaseName = databaseName;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     *            the userName to set
     */
    public void setUserName(String userName) {

        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     *            the password to set
     */
    public void setPassword(String password) {

        this.password = password;
    }

    /**
     * @return the schema
     */
    public String getSchema() {
        return schema;
    }

    /**
     * @param schema
     *            the schema to set
     */
    public void setSchema(String schema) {

        this.schema = schema;
    }

    /**
     * @return the connectionString
     */
    public String getConnectionString() {
        return connectionString;
    }

    /**
     * @param connectionString
     *            the connectionString to set
     */
    public void setConnectionString(String connectionString) {

        this.connectionString = connectionString;
    }

    /**
     * @return the dbUri
     */
    public String getDbUri() {
        return dbUri;
    }

    /**
     * @param dbUri
     *            the dbUri to set
     */
    public void setDbUri(String dbUri) {
        this.dbUri = dbUri;
    }
}
