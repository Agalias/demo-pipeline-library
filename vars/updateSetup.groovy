def call(String setupPath) {
    echo "${setupPath}"
    powershell '''
    cd "${setupPath}"
    git stash
    git pull
    '''
}