package fr.lernejo.tester;

import fr.lernejo.tester.api.TestMethod;

class SomeLernejoTests {
    @TestMethod
    public void ok()

    @TestMethod
    public void ko() {
        throw new IllegalStateException();
    }

    public void none() {}
}
