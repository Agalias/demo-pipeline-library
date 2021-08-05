def call(String setupPath = AUTOMATION_PATH) {
    powershell """
    cd '${setupPath}'
    git stash
    git pull
    """
}