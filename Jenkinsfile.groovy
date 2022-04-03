pipeline {
    agent any
    stages {
        state('greeting') {
            steps {
                echo 'Hello World!'
            }
        } // state('greeting') {
    } // stages {
} // pipeline {