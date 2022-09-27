package com.kaparzh.eugeniydemo.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {

    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality) {
        Developer developer = developers.get(speciality);
        if (developer == null) {
            switch (speciality) {
                case "java":
                    System.out.println("Hiring java developer...");
                    developer = new JavaDeveloper();
                    break;
                case "C++":
                    System.out.println("Hiring C++ developer...");
                    developer = new CppDeveloper();
                    break;
            }
            developers.put(speciality, developer);
        }
        return developer;
    }
}
