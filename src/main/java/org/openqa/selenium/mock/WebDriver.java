package org.openqa.selenium.mock;

public interface WebDriver {
    void get(String url);
    String getTitle();
    void quit();
}
