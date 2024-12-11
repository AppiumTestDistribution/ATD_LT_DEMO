package com.test.site;

import org.testng.annotations.Test;

@Test
public class SliderTest extends UserBaseTest {
    @Test
    public void dragNDrop() {
        login("login").click();
        waitForElement("dragAndDrop").click();
        waitForElement("dragMe").click();
    }
}