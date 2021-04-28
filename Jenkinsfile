pipeline {
    agent any
       triggers {
        pollSCM "* * * * *"
       }
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
