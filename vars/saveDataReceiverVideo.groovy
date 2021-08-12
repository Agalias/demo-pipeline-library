def call(String TIMESTAMP = TIMESTAMP) {
    powershell """
    cp C:/jenkins/workspace/TVM/*  L:/processing/'${TIMESTAMP}'
    cp C:/jenkins/workspace/TVM/sender/*  L:/processing/'${TIMESTAMP}'/sender
    echo VideoAndAudio > L:/processing/'${TIMESTAMP}'/Video.txt
    """
}