def call(String webdriverPath = WEBDRIVER_PATH, String time = TEST_TIME) {
    powershell """
    Set-Location -Path '${webdriverPath}'
    Start-Process -FilePath java -ArgumentList '-jar selenium-server-standalone-3.141.59.jar'
    Start-Sleep -Seconds (120+'${time}')
    Stop-Process -Force
    """
}