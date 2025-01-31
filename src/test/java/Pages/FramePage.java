package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BasePage {
    public FramePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "sampleHeading")
    private WebElement frameElement;

    public void dealWithIFrame() {
        frameMethods.switchSpecificIframe("frame1");
        System.out.println(frameElement.getText());
        frameMethods.switchParentFrame();

        frameMethods.switchSpecificIframe("frame2");
        System.out.println(frameElement.getText());
    }

}
