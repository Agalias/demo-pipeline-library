def call(String setupPath) {
    powershell '''
    cd $Env:setupPath
    git stash
    git pull
    '''
}