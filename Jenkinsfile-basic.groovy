pipeline {
    agent any
    stages {
        stage('greeting') {
            steps {
                echo 'Hello World!'
            }
        } // state('greeting')
    } // stages
} // pipeline