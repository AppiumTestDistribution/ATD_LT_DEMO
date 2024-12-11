
import com.appium.manager.ATDRunner;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    @Test
    public static void testApp() throws Exception {
        List<String> tests = new ArrayList<>();
        tests.add("SliderTest");
        ATDRunner atdRunner = new ATDRunner();
        boolean hasFailures = atdRunner.runner("com.test.site", tests);
        Assert.assertFalse(hasFailures, "Testcases have failed in parallel execution");
    }
}