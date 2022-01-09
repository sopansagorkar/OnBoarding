package org.epam.onboarding.collections;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Sopan_Sagorkar
 * **/
public class Student {
    @Getter @Setter
    public int rollNumber;

    @Getter @Setter
    public String name;

    @Getter @Setter
    public String className;

    @Getter @Setter
    public double attendance;

}
