package com.globant.testCase.demo.tests;

import org.testng.annotations.*;

import java.util.logging.Logger;

public class LoginTest {

    Logger logger = Logger.getLogger(this.getClass().getName());

    @BeforeClass
    @Parameters({"browser"})
    public void openBrowser(String browser) {
        logger.info("-- Login Test --");
        logger.info("*Opening browser:  " + browser);
    }

    @BeforeMethod
    @Parameters({"URL"})
    public void searchPage(String url) {
        logger.info("*Searching page: " + url);
    }

    @Test
    @Parameters({"username", "password"})
    public void logginTest(String username, String password) {
        logger.info("*Clicking the top-rigth button");
        logger.info("*Clicking the 'Log In' button");
        logger.info("*Typing the username: " + username);
        logger.info("*Typing the password: " + password);
        logger.info("*Clicking the 'Log In' button");
    }

    @AfterTest
    @Parameters({"browser"})
    public void closeBrowser(String browser) {
        logger.info("*Closing browser:  " + browser);
    }

}
