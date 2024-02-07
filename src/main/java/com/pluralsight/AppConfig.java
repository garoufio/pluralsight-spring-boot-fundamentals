package com.pluralsight;

import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.repository.StubSpeakerRepositoryImpl;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean(name="speakerService")
  public SpeakerService getSpeakerService() {
    SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getSpeakerRepository()); // constructor injection
    //speakerService.setSpeakerRepository(getSpeakerRepository()); // setter injection
    return speakerService;
  }

  @Bean(name="speakerRepository")
  public SpeakerRepository getSpeakerRepository() {
    return new StubSpeakerRepositoryImpl();
  }

}
