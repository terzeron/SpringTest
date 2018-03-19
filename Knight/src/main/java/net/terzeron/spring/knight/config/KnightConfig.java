package net.terzeron.spring.knight.config;

import net.terzeron.spring.knight.BraveKnight;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.terzeron.spring.knight.BraveKnight;
import net.terzeron.spring.knight.Knight;
import net.terzeron.spring.knight.Quest;
import net.terzeron.spring.knight.SlayDragonQuest;

@Configuration
public class KnightConfig {

  @Bean
  public Knight knight() {
    return new BraveKnight(quest());
  }
  
  @Bean
  public Quest quest() {
    return new SlayDragonQuest(System.out);
  }

}
