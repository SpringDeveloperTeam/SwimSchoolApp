pipeline {
    agent any

    stages {
        stage('Clean space') {
                steps {
                    // checkout scm
                    echo 'Limpiar espaco de trabajo Jenkins'
                    cleanWs()
                }
            }
        stage('Checkout') {
            steps {
                // checkout scm
                echo 'Clonando el repositorio'
            }
        }

        stage('Build') {
            steps {
               // sh 'mvn clean install -DskipTests'
               echo 'Construccion del repositorio'
            }
        }

        stage('Format') {
            steps {
                // sh 'mvn googleformatter:format'
                echo 'Formateo de codigo'
            }
        }
    }
}
