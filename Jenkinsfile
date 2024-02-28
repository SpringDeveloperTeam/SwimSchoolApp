pipeline {
    agent any
    tools {
        maven 'mavenjenkins'
    }
    stages {
        stage('Limpiar') {
            steps {
                cleanWs()
            }
        }

        stage('Formatear código') {
            steps {
                // sh 'mvn googleformatter-maven-plugin:format'
                echo 'mvn googleformatter-maven-plugin:format'
            }
        }

        stage('Construir proyecto') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }

        stage('Ejecutar tests unitarios') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
