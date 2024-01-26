package com.pluralsight;

import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import com.pluralsight.model.Speaker;

import java.util.List;

public class Application {

  public static void main(String[] args) {
    SpeakerService speakerService = new SpeakerServiceImpl();
    List<Speaker> speakers = speakerService.findAll();

    if (!speakers.isEmpty()) {
      System.out.println(speakers.get(0).toString());
    }
    else {
      System.out.println("No speakers found.");
    }
  }

} 