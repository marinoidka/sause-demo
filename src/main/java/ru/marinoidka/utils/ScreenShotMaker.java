package ru.marinoidka.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ScreenShotMaker {
    public static File makeScreenshotOnFailure(WebDriver driver) {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

    }
}
