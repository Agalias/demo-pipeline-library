def call() {
    powershell '''
    Remove-Item C:/jenkins/workspace/TVM/* -Recurse -Force
    '''
}