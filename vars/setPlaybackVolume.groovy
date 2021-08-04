def call(String volumeNumber) {
    powershell '''
        New-Item "$($profile | split-path)\\Modules\\AudioDeviceCmdlets" -Type directory -Force
        Copy-Item "C:\\jenkins\\workspace\\agents\\AudioDeviceCmdlets.dll" "$($profile | split-path)\\Modules\\AudioDeviceCmdlets\\AudioDeviceCmdlets.dll"
        Set-Location "$($profile | Split-Path)\\Modules\\AudioDeviceCmdlets"
        Get-ChildItem | Unblock-File
        Import-Module AudioDeviceCmdlets
        Set-AudioDevice -PlaybackVolume $env:volumeNumber
    '''
}