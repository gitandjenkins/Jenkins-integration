pipeline {
    agent any

    stages {
        stage('BUILD') {
            steps {
                echo 'Hello World'
            }
        }
        
        
        stage('TEST') {
            steps {
                echo 'Hello World'
            }
        }
        
        
        stage('DEPLOY') {
            steps {
                echo 'Hello World'
            }
        }
        
       
    }
    
    post{
        always{
            
            emailext body: 'Good morning Sir', subject: 'this is pipe line result', to: 'adamautomationtester@gmail.com'
        }
    }
}
