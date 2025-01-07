from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    actions = ActionChains(driver)
    driver.get("https://training-support.net/webelements/keyboard-events")
    print("Page title is: ", driver.title)
    actions.send_keys("Hello Selenium").perform()
    pageText = driver.find_element(By.CSS_SELECTOR, "h1.mt-3").text
    print(pageText)
    driver.quit()