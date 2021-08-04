def call(int volumeNumber) {
    powershell '''
        echo $env:volumeNumber
    '''
}