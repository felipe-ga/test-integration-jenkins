pipeline {
    agent any
    triggers {
        pollSCM "* * * * *"
    }
    options {
          timeout(time: 3, unit: 'MINUTES')
     }
    stages {
            stage ('Clean & Build Artifact') {
                agent {
                    docker {
                        image 'openjdk:11'
                        args '-v "$PWD":/app'
                        reuseNode true
                    }
                }
                steps {
                    echo '=== Building mutation Application ==='
                    sh './gradlew clean build'
                }
            }
            stage ('Test Artifact') {
                agent {
                    docker {
                       image 'openjdk:11'
                       args '-v "$PWD":/app'
                       reuseNode true
                    }
                }
                steps {
                    echo '=== Testing mutation Application ==='
                    sh './gradlew test'
                }
            }
        }
    }
}
