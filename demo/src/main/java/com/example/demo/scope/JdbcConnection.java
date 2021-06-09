package com.example.demo.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/*
	Use proxyMode when for a singleton bean you want different dependency bean every time.
	com.example.demo.scope.PersonDAO@5023bb8b
	com.example.demo.scopeDemoApplication    : com.example.demo.scope.JdbcConnection@1e0f9063
	com.example.demo.scopeDemoApplication    : com.example.demo.scope.PersonDAO@5023bb8b
	com.example.demo.scopeDemoApplication    : com.example.demo.scope.JdbcConnection@1e0f9063
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {
	public JdbcConnection() {
		System.out.println("JDBC Connection");
	}
}
