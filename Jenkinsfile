def git_url="https://gitlab.com/wzr0008/easygo.git"
node{
def EasyGo
stage("pull the code"){
    checkout([$class: 'GitSCM', branches: [[name: "*/${branch}"]], extensions: [], userRemoteConfigs: [[credentialsId: 'master', url: "${git_url}"]]])
}
stage("Package the MicroServices"){
   sh "mvn -f ${project_name} clean package dockerfile:build"
}
}