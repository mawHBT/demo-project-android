package de.dagere.peass;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleTest {

    @Test
    public void test() {
        final ExampleClazz exampleClazz = new ExampleClazz();
        exampleClazz.calleeMethod();
        assertNotNull(exampleClazz);
    }

}