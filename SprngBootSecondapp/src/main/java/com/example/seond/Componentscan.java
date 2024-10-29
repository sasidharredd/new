package com.example.seond;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Componentscan {
	@Value("${my.sql.driver}")
	private String driver;
	@Value("${my.sql.url}")
	private String Url;
	@Value("${my.sql.uname}")
	private String Username;
	@Value("${my.sql.password}")
	private String Password;
	@Override
	public String toString() {
		return "Componentscan [driver=" + driver + ", Url=" + Url + ", Username=" + Username + ", Password=" + Password
				+ "]";
	}

}
