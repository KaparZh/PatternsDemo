package com.kaparzh.eugeniydemo.creational.factory;

public class Program {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryBySpeciality(Speciality.Cpp);
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperFactoryBySpeciality(Speciality speciality) {
        switch (speciality) {
            case Java:
                return new JavaDeveloperFactory();
            case Cpp:
                return new CppDeveloperFactory();
            case Php:
                return new PhpDeveloperFactory();
            default:
                throw new RuntimeException(speciality + " is unknown!");
        }
    }
}
