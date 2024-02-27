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

        stage('Commit & Push') {
            steps {
                echo 'Commit'
            }
        }

        stage('Test') {
            steps {
                // sh 'mvn test' // Ejecuta los tests unitarios
                echo 'Test again'
            }
        }
    }
}
