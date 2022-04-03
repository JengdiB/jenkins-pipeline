pipeline {
    agent any
    stages {
        stage('greeting-matrix') {
            matrix {
                axes {
                    axis {
                        name 'MODEL'
                        values 'KLR-650', 'Tenere-700'
                    } // axis
                } // axes
                stages {
                    stage('greeting') {
                        steps {
                            echo "Hello $MODEL"
                        } //  steps
                    } // stage('greeting')
                } // stages
            } // matrix
        } // stage('greeting-parallel')
    } // stages
} // pipeline