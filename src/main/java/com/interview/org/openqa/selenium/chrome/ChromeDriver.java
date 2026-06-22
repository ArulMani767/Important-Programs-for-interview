package org.openqa.selenium.chrome;

import org.openqa.selenium.WebDriver;

public class ChromeDriver implements WebDriver {
    public ChromeDriver(ChromeOptions options) {
        // Stub constructor for compilation.
    }

    @Override
    public void get(String url) {
        System.out.println("[ChromeDriver stub] Navigating to " + url);
    }

    @Override
    public String getTitle() {
        return "[ChromeDriver stub title]";
    }

    @Override
    public void quit() {
        System.out.println("[ChromeDriver stub] Quit browser");
    }
}
