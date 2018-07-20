package com.omjigupta.ask.aboutme;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.omjigupta.ask.aboutme.handlers.LaunchRequestHandler;

public class AboutMeSkillStreamHandler extends SkillStreamHandler {

  private static Skill getSkill() {
    return Skills.standard()
            .addRequestHandlers(new LaunchRequestHandler())
            .build();
  }

  public AboutMeSkillStreamHandler() {
    super(getSkill());
  }


}
