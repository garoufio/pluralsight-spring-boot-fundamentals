package com.pluralsight;

import com.pluralsight.service.SpeakerService;
import com.pluralsight.model.Speaker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {

  public static void main(String[] args) {

    ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

    SpeakerService speakerService = appContext.getBean("speakerService", SpeakerService.class);
    List<Speaker> speakers = speakerService.findAll();
    if (!speakers.isEmpty()) {
      System.out.println(speakers.get(0).toString());
    }
    else {
      System.out.println("No speakers found.");
    }
  }

}