pipeline {
    agent any
    triggers {
        pollSCM "* * * * *"
    }
    options { timeout(time: 5) }
    stages {
        stage('Build Application') {
            steps {
                echo '=== Building mutation Application ==='
                sh "./gradlew build"
            }
        }
        stage('Test Application') {
            steps {
                echo '=== Testing mutation Application ==='
                sh "./gradlew test"
            }
        }
    }
}
