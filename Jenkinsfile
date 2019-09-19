pipeline {
    agent any
    stages {
        stage('Prepare') {
            steps {
                //sh '/home/ubuntu/welcome/backup.sh'
                sh 'echo 代码检查'
            }
        }
        stage('Build') {
            steps {
                //sh '/home/apache-maven-3.6.2/bin/mvn clean package'
                echo 'build success'
            }
        }
        stage('Test') {
            steps {
                sh '/home/apache-maven-3.6.2/bin/mvn test'
            }
        }
        stage('Deploy') {
            steps {
                sh '/home/ubuntu/welcome/restart.sh'
            }
        }
    }
}
