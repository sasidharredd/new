package com.example.seond;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class PackageRuner implements CommandLineRunner{
	@Autowired
	Componentscan scan;
@Override
public void run(String... args) throws Exception {
System.out.println(scan);	
}
}
