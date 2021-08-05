def call(String setupPath) {
    echo "${setupPath}"
    powershell """
    cd $Env:setupPath
    git stash
    git pull
    """
}