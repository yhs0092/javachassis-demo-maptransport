package com.github.yhs0092.service;

import java.util.Map;

public interface Hello {
  GreetingResponse sayHello(Map<String, Person> personMap);

  Map<String, String> sayHi(Map<String, String> personMap);
}
