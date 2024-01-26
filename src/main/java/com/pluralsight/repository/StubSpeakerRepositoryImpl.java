package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.List;
import java.util.ArrayList;

public class StubSpeakerRepositoryImpl implements SpeakerRepository {

   @Override
   public List<Speaker> findAll() {
     List<Speaker> speakers = new ArrayList<>();

     Speaker speaker = new Speaker("Harvey", "Spector");
     speakers.add(speaker);

     return speakers;
   }

}