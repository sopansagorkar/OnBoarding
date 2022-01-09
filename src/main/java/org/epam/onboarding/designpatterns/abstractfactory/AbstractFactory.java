package org.epam.onboarding.designpatterns.abstractfactory;

public interface AbstractFactory<T> {
    T create(String animalType) ;
}
