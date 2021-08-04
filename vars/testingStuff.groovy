def call(String volumeNumber) {
    powershell '''
        echo $env:volumeNumber
    '''
}