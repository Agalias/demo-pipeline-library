def call() {
    powershell '''
    Remove-Item C:/jenkins/workspace/TVM/* -Recurse -Force
    taskkill /IM "TeamViewerMeeting.exe" /F
    taskkill /IM "Zoom.exe" /F
    Stop-Process -Id (Get-NetTCPConnection -LocalPort 4444).OwningProcess -Force
    taskkill /IM "chrome.exe" /F
    exit 0
    '''
}