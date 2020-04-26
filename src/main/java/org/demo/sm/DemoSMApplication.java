package org.demo.sm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.demo.sm.model.Customer;
import org.demo.sm.model.Metric;
import org.demo.sm.service.CustomerRepository;
import org.demo.sm.service.IMetricsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

@SpringBootApplication
public class DemoSMApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DemoSMApplication.class);
	
	@Value("${metrics.csvfile}")
	private Path csvfile;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoSMApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner LoadData(IMetricsRepository repository) {
		
		return (args) -> {	
			log.info("csv file is " + csvfile);
			
			List<Metric> metrics = readCSVFile();
			
			log.info("All metrics from CSV file:");
			log.info("-------------------------------");
			log.info("Number of entries: " + metrics.size());
			
			for (Metric m : metrics) {
				log.info("saving record: " + m.toString());
				repository.save(new Metric(m));
			}
			
			log.info("All metrics from database:");
			log.info("-------------------------------");
			
			for (Metric m : repository.findAll()) {
				log.info(m.toString());
			}
		};
	}
	
	private  List<Metric> readCSVFile() throws IOException{
		
		List<Metric> metrics = null;
		
		BufferedReader reader = null;
		try {
			
			ColumnPositionMappingStrategy ms = new ColumnPositionMappingStrategy();
		    ms.setType(Metric.class);
		     
			reader = Files.newBufferedReader(csvfile);
			
            CsvToBean<Metric> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Metric.class)
                    .build();

            metrics = csvToBean.parse();    
        } 
		finally {
            if (reader != null) reader.close();
		}
		
		return metrics;
	}
	
//	@Bean
//	public CommandLineRunner demo(CustomerRepository repository) {
//		return (args) -> {
//			
//			// save a few customers
//			repository.save(new Customer("Jack", "Bauer"));
//			repository.save(new Customer("Chloe", "O'Brian"));
//			repository.save(new Customer("Kim", "Bauer"));
//			repository.save(new Customer("David", "Palmer"));
//			repository.save(new Customer("Michelle", "Dessler"));
//		
//			// fetch all customers
//			log.info("Customers found with findAll():");
//			log.info("-------------------------------");
//			
//			for (Customer customer : repository.findAll()) {
//				log.info(customer.toString());
//			}
//			
//			log.info("");
//		
//			// fetch an individual customer by ID
//			Customer customer = repository.findById(4L);
//			log.info("Customer found with findById(1L):");
//			log.info("--------------------------------");
//			log.info(customer.toString());
//			log.info("");
//		
//			// fetch customers by last name
//			log.info("Customer found with findByLastName('Bauer'):");
//			log.info("--------------------------------------------");
//			
//			repository.findByLastName("Bauer").forEach(bauer -> {
//				log.info(bauer.toString());
//			});
//			
//			log.info("");
//		};
//	}
	
}
