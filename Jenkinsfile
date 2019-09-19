pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh '/home/apache-maven-3.6.2/bin/mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'echo test'
            }
        }
        stage('Deploy') {
            steps {
                sh '/home/ubuntu/welcome/start.sh'
            }
        }
    }
}