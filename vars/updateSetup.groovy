def call(String setupPath) {
    powershell '''
    cd setupPath
    git stash
    git pull
    '''
}