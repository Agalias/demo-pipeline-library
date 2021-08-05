def call(Map config) {
    powershell """
    Set-Location -Path '${config.webdriverPath}'
    Start-Process -FilePath java -ArgumentList '-jar selenium-server-standalone-3.141.59.jar'
    Start-Sleep -Seconds (120+'${config.time}')
    Stop-Process -Force
    """
}