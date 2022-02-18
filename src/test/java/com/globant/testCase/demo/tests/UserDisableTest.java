package com.globant.testCase.demo.tests;

import org.testng.annotations.*;

import java.util.logging.Logger;

public class UserDisableTest {

    Logger logger = Logger.getLogger(this.getClass().getName());

    @BeforeClass
    @Parameters({"browser"})
    public void openBrowser(String browser) {
        logger.info("-- User disable Test --");
        logger.info("*Opening browser:  " + browser);
    }

    @BeforeTest
    @Parameters({"URL"})
    public void searchPage(String url) {
        logger.info("*Searching page: " + url);
    }

    @Test
    @Parameters({"username", "password"})
    public void logginTest(String username, String password) {
        logger.info("*Clicking the top-rigth button");
        logger.info("*Clicking the 'User' button");
        logger.info("*Typing the username: " + username);
        logger.info("*Typing the password: " + password);
        logger.info("*Clicking the 'Log In' button");
        logger.info("*Clicking the 'User' button");
        logger.info("*Clicking the 'ESPN Profile' button");
        logger.info("*Clicking the 'Delete account' button");
    }

    @AfterTest
    @Parameters({"browser"})
    public void closeBrowser(String browser) {
        logger.info("*Closing browser:  " + browser);
    }

}
