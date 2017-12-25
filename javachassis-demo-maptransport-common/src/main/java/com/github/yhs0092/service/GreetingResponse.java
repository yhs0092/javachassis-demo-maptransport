package com.github.yhs0092.service;

import java.util.List;

public class GreetingResponse {
  private List<String> greetings;

  public List<String> getGreetings() {
    return greetings;
  }

  public GreetingResponse setGreetings(List<String> greetings) {
    this.greetings = greetings;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("GreetingResponse{");
    sb.append("greetings=").append(greetings);
    sb.append('}');
    return sb.toString();
  }
}
