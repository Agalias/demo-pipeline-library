def call() {
    powershell '''
    cd $env:AUTOMATION_PATH
    git stash
    git pull
    '''
}