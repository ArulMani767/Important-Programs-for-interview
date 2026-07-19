package org.openqa.selenium;

import java.util.ArrayList;
import java.util.List;

/**
 * ChromeOptions class for configuring Chrome browser options.
 * Provides a clean interface for setting various Chrome browser configurations.
 * 
 * EXAMPLE USAGE:
 * ============
 * ChromeOptions options = new ChromeOptions();
 * 
 * // 1. Disable notifications (push notifications from websites)
 * options.addArguments("--disable-notifications");
 * 
 * // 2. Disable popup blocking
 * options.addArguments("--disable-popup-blocking");
 * 
 * // 3. Disable infobars (like "Chrome is being controlled by automated test software")
 * options.addArguments("--disable-infobars");
 * 
 * // 4. Start browser maximized
 * options.addArguments("--start-maximized");
 * 
 * // 5. Run browser in headless mode (no UI)
 * options.addArguments("--headless=new");  // for Selenium 4.6+ & Chrome 109+
 * 
 * // 6. Disable extensions
 * options.addArguments("--disable-extensions");
 * 
 * // 7. Incognito mode
 * options.addArguments("--incognito");
 * 
 * // 8. Ignore certificate errors (useful for HTTPS issues in test env)
 * options.addArguments("--ignore-certificate-errors");
 * 
 * // 9. Allow remote origins (needed in latest Chrome versions)
 * options.addArguments("--remote-allow-origins=*");
 * 
 * // Launch Chrome with these options
 * WebDriver driver = new ChromeDriver(options);
 * driver.get("https://www.google.com");
 * System.out.println("Title: " + driver.getTitle());
 * driver.quit();
 */
public class ChromeOptions {
    private List<String> arguments;

    /**
     * Constructor initializes ChromeOptions
     */
    public ChromeOptions() {
        this.arguments = new ArrayList<>();
    }

    /**
     * Add command line arguments to Chrome
     * @param arg Argument to add (e.g., "--headless", "--incognito")
     * @return this ChromeOptions instance for method chaining
     */
    public ChromeOptions addArguments(String arg) {
        if (arg == null || arg.trim().isEmpty()) {
            System.err.println("[ChromeOptions] Argument cannot be null or empty");
            return this;
        }
        try {
            this.arguments.add(arg);
            System.out.println("[ChromeOptions] Added argument: " + arg);
            return this;
        } catch (Exception e) {
            System.err.println("[ChromeOptions] Failed to add argument: " + e.getMessage());
            throw e;
        }
    }

    /**
     * Add multiple command line arguments to Chrome
     * @param args Variable arguments list
     * @return this ChromeOptions instance for method chaining
     */
    public ChromeOptions addArguments(String... args) {
        if (args == null || args.length == 0) {
            System.err.println("[ChromeOptions] Arguments list cannot be null or empty");
            return this;
        }
        for (String arg : args) {
            if (arg != null && !arg.trim().isEmpty()) {
                addArguments(arg);
            }
        }
        return this;
    }

    /**
     * Set the browser to run in headless mode (no UI)
     * @return this ChromeOptions instance for method chaining
     */
    public ChromeOptions setHeadless() {
        return addArguments("--headless=new");
    }

    /**
     * Disable notifications
     * @return this ChromeOptions instance for method chaining
     */
    public ChromeOptions disableNotifications() {
        return addArguments("--disable-notifications");
    }

    /**
     * Disable popups
     * @return this ChromeOptions instance for method chaining
     */
    public ChromeOptions disablePopupBlocking() {
        return addArguments("--disable-popup-blocking");
    }

    /**
     * Disable infobars
     * @return this ChromeOptions instance for method chaining
     */
    public ChromeOptions disableInfobars() {
        return addArguments("--disable-infobars");
    }

    /**
     * Start browser maximized
     * @return this ChromeOptions instance for method chaining
     */
    public ChromeOptions startMaximized() {
        return addArguments("--start-maximized");
    }

    /**
     * Disable extensions
     * @return this ChromeOptions instance for method chaining
     */
    public ChromeOptions disableExtensions() {
        return addArguments("--disable-extensions");
    }

    /**
     * Enable incognito mode
     * @return this ChromeOptions instance for method chaining
     */
    public ChromeOptions incognito() {
        return addArguments("--incognito");
    }

    /**
     * Ignore certificate errors
     * @return this ChromeOptions instance for method chaining
     */
    public ChromeOptions ignoreCertificateErrors() {
        return addArguments("--ignore-certificate-errors");
    }

    /**
     * Allow remote origins (needed in latest Chrome versions)
     * @return this ChromeOptions instance for method chaining
     */
    public ChromeOptions allowRemoteOrigins() {
        return addArguments("--remote-allow-origins=*");
    }

    /**
     * Set window size
     * @param width Window width
     * @param height Window height
     * @return this ChromeOptions instance for method chaining
     */
    public ChromeOptions setWindowSize(int width, int height) {
        return addArguments("--window-size=" + width + "," + height);
    }

    /**
     * Get all configured arguments
     * @return List of Chrome arguments
     */
    public List<String> getArguments() {
        return new ArrayList<>(arguments);
    }
}
