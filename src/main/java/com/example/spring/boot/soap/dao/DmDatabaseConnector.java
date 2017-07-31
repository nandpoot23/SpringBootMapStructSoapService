package com.example.spring.boot.soap.dao;

import org.springframework.jdbc.core.JdbcOperations;

public class DmDatabaseConnector {

    private JdbcOperations jdbcTemplate;

    public JdbcOperations getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcOperations jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

}
