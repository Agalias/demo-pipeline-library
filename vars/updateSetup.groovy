def call(String setupPath) {
    echo "${setupPath}"
    powershell """
    echo '${setupPath}'
    cd '${setupPath}'
    git stash
    git pull
    """
}