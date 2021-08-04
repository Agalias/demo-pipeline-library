def call(string volumeNumber) {
    powershell '''
        echo $env:volumeNumber
    '''
}