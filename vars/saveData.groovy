def TVEmaster(String TIMESTAMP = TIMESTAMP) {
    powershell """
    mkdir L:/processing/'${TIMESTAMP}'
    mkdir L:/processing/'${TIMESTAMP}'/sender
    cp C:/jenkins/workspace/TVM/*  L:/processing/'${TIMESTAMP}'
    cp C:/jenkins/workspace/TVM/sender/*  L:/processing/'${TIMESTAMP}'/sender
    """
}