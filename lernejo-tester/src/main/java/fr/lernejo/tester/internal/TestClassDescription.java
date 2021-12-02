package fr.lernejo.tester.internal;

import java.lang.reflect.Method;
import java.util.List;

public class TestClassDescription {
    public void constructor1(Class<SomeLernejoTests> testClass){}

    public List<Method> listTestMethods() {
        List<Method> someList = null;

        Class<SomeLernejoTests> testClass = SomeLernejoTests.class;


        return someList;
    }
}
