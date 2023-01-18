pipeline {

    environment{

    }

    tools{

    }

    options{
        disableConcurrentBuild()
    }
    agent any
    stages {

        stage ('Prep'){
            steps{
                checkout scm
            }
        }
        stage ('Build'){
            steps{
                script{
                    if (fileExists(my-code.c)) == false){
                    }
                }
            }
        }
        stage('Deploy') {
            when {not {equals expected : 'UNSTABLE'}}
            steps {
                echo 'Deploying software'
            }
        }

        stage('deploy'){



        }
    }
}