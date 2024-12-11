package com.test.site;

import com.appium.manager.ATDRunner;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    @Test
    public static void testApp() throws Exception {
        List<String> tests = new ArrayList<>();
        tests.add("SliderTest");
        ATDRunner atdRunner = new ATDRunner();
        boolean hasFailures = atdRunner.runner("com.test.site");
        Assert.assertFalse(hasFailures, "Testcases have failed in parallel execution");
    }
}