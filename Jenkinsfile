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
                sh 'mvn com.theoryinpractise:googleformatter-maven-plugin:format'
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
