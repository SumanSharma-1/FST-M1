from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    actions = ActionChains(driver)
    driver.get("https://training-support.net/webelements/mouse-events")
    print("Page title is: ", driver.title)

    cargoLock = driver.find_element(By.XPATH, "//h1[text()='Cargo.lock']")
    cargoToml = driver.find_element(By.XPATH, "//h1[text()='Cargo.toml']")
    srcButton = driver.find_element(By.XPATH, "//h1[text()='src']")
    targetButton = driver.find_element(By.XPATH, "//h1[text()='target']")

    actions.click(cargoLock).pause(1).move_to_element(cargoToml).click(cargoToml).perform()
    actionMessage = driver.find_element(By.ID, "result").text
    print("Confirmation message", actionMessage)

    actions.double_click(srcButton).context_click(targetButton).perform()
    actions.click(driver.find_element(By.XPATH, ("//div[@id='menu']/div/ul/li[1]"))).pause(5).perform()
    actionMessage1 = driver.find_element(By.ID, "result").text
    print("Confirmation message", actionMessage1)
    driver.quit()