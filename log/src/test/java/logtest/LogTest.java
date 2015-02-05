package logtest;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Created by navia on 2015/2/5.
 */
public class LogTest {
    private static Logger logger = Logger.getLogger(LogTest.class);

    @Test
    public void testLog() throws Exception {
        logger.debug("fdsafads");
    }
}
