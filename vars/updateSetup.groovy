def call(Map config) {
    powershell '''
    cd config.setupPath
    git stash
    git pull
    '''
}