import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities

reportsDir = "build/geb-spock-reports"

def WIN_CHROME_DRIVER = "src\\main\\resources\\chromedriver.exe"
def chromeArguments = ["--start-maximized", "--disable-extensions", "-incognito"]

System.setProperty("webdriver.chrome.driver", WIN_CHROME_DRIVER)

DesiredCapabilities chromeCapabilities = new DesiredCapabilities()
ChromeOptions chromeOptions = new ChromeOptions()
chromeOptions.addArguments(chromeArguments)
chromeCapabilities.setCapability(chromeOptions.CAPABILITY, chromeOptions)

driver = { new ChromeDriver(chromeCapabilities) }

baseUrl = "https://www.google.com"

waiting = {
    timeout = 60
    retryInterval = 0.5
}

environments = {

    "chrome" {
        driver = { new ChromeDriver(chromeCapabilities) }
    }
}
