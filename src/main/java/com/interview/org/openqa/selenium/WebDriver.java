package org.openqa.selenium;

public interface WebDriver {
    void get(String url);
    String getTitle();
    void quit();
}
