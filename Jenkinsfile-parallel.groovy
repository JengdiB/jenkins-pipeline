pipeline {
    agent any
    stages {
        stage('greeting-parallel') {
            failFast true // to enforce parallel to aboart if one stage fail
            parallel {
                stage('greeting-1') {
                    steps {
                        sleep 10
                        echo 'Hello World-1!'
                    } //  steps
                } // stage('greeting-1')
                stage('greeting-2') {
                    steps {
                        sleep 5
                        error "error intentionally"
                        echo 'Hello World-2!'
                    } //  steps
                } // stage('greeting-2')
            } // parallel
        } // stage('greeting-parallel')
    } // stages
} // pipeline