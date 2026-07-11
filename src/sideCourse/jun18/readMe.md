github - maven build - test - docker image - deploy to dev - QA - prod 

pipeline {
agent any

    stages {
        stage('Git clone') {
            steps {
                git url: 'https://github.com/prgara/HttpClientFeb.git'
            }
        }
        stage('Maven clean') {
            steps {
                sh 'mvn clean'
            }
        }
         stage('Maven install') {
            steps {
                sh 'mvn install'
            }
        }
        
         stage('test cases') {
            steps {
                sh 'mvn test'
            }
        }
        
         stage('SonarQube testing') {
            steps {
                echo 'Sonar test running'
                sleep 10
            }
        }
        
         stage('Containerization') {
            steps {
                echo 'Creating docker image and pushing to registry'
                sleep 10
            }
        }
        
         stage('Deployment - Dev') {
            steps {
echo 'Code deployed to dev envirnonmnet'
}
}

        stage('Deployment - QA') {
            steps {
echo 'Code deployed to QA envirnonmnet'
sleep 10
}
}

        stage('Deployment - Production') {
            steps {
echo 'Code deployed to prod envirnonmnet'
}
}

    }
}
