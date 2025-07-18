def call() {
  pipeline {
    agent any
    
    stages {
      stage ("Maven Clean"){
        steps {
          script {
            maven.multiCall(["clean"])
          }
        }
      }
      stage ("Maven Compile"){
        steps {
          script {
            maven.multiCall(["compile"])
          }
        }
      }
      stage ("Maven Test"){
        steps {
          script {
            maven.multiCall(["test"])
          }
        }
      }
    }
  }
}