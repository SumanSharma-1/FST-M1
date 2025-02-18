from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/login-form")
    print("Page title is: ", driver.title)

    username = driver.find_element(By.ID, "username")
    username.send_keys("admin")
    password = driver.find_element(By.ID, "password")
    password.send_keys("password")

    login = driver.find_element(By.XPATH, "//button[text()='Submit']")
    login.click()
    driver.quit()