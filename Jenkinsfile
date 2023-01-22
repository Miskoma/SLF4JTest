node {
  stage("Clone the project") {
    git branch: 'main', url: 'https://github.com/Miskoma/SLF4JTest'
  }

  stage("Compilation") {
    bat "./mvnw clean install -DskipTests"
  }
  stage("Tests and Deployment") {
    stage("Runing unit tests") {
      bat "./mvnw test -Punit"
    }

     stage('Deliver') {
            bat './jenkins/scripts/deliver.jar'
     }
  }
}