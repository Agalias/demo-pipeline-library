def call(String setupPath) {
    powershell """
    echo '${setupPath}'
    cd '${setupPath}'
    git stash
    git pull
    """
}