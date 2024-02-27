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
                script {
                   /* // Comprueba si hay cambios después del formateo
                    def hasChanges = sh(script: 'git status --porcelain', returnStdout: true).trim()
                    if (hasChanges) {

                        // Configura Git si es necesario
                        sh 'git config user.email "you@example.com"'
                        sh 'git config user.name "Your Name"'

                        // Añade, haz commit y empuja los cambios
                        sh 'git add .'
                        sh 'git commit -m "Apply Google Code Format"'
                        sh 'git push' */
                        echo 'Hay cambios despues del formateo'
                    } else {
                        echo 'No hay cambios despues del formateo'
                    }
                }
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test' // Ejecuta los tests unitarios
            }
        }
    }
}
