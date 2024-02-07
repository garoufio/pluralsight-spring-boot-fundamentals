package com.pluralsight.repository;
import com.pluralsight.model.Speaker;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;

@Repository("speakerRepository")
public class StubSpeakerRepositoryImpl implements SpeakerRepository {

   @Override
   public List<Speaker> findAll() {
     List<Speaker> speakers = new ArrayList<>();

     Speaker speaker = new Speaker("Harvey", "Spector");
     speakers.add(speaker);

     return speakers;
   }

}