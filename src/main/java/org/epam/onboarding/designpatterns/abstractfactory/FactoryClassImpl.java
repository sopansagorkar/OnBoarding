package org.epam.onboarding.designpatterns.abstractfactory;

public class FactoryClassImpl {
    public static void main(String[] args) {
        AnimalFactory animalFactory=new AnimalFactory();
        Animal animal=animalFactory.create("Dog");
        System.out.println(animal.getAnimal());
        System.out.println(animal.makeSound());

    }
}
