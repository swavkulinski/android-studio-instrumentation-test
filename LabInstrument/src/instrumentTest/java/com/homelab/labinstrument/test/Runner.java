package com.homelab.labinstrument.test;

import android.test.InstrumentationTestRunner;
import android.test.InstrumentationTestSuite;
import com.homelab.labinstrument.MainActivityTest;
import junit.framework.TestSuite;

/**
 * Created by swav on 21/08/13.
 */
public class Runner extends InstrumentationTestRunner {

    @Override
    public TestSuite getAllTests(){
        InstrumentationTestSuite suite = new InstrumentationTestSuite(this);
        suite.addTestSuite(MainActivityTest.class);
        return suite;
    }

    @Override
    public ClassLoader getLoader() {
        return Runner.class.getClassLoader();
    }

}
