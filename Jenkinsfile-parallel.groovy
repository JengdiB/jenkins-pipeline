pipeline {
    agent any
    stages {
        stage('greeting-parallel') {
            parallel {
                stage('greeting-1') {
                    steps {
                        echo 'Hello World-1!'
                    } //  steps
                } // stage('greeting-1')
                stage('greeting-2') {
                    steps {
                        echo 'Hello World-2!'
                    } //  steps
                } // stage('greeting-2')
            } // parallel
        } // stage('greeting-parallel')
    } // stages
} // pipeline