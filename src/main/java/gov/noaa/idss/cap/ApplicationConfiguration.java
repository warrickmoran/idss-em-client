package gov.noaa.idss.cap;

import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
	@Bean
	public DataFormat jaxb() {
		return new JaxbDataFormat("oasis.names.tc.emergency.cap._1");
	}
}
