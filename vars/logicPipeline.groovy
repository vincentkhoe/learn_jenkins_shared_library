def call (Map config){
  if (config.type == "backend") {
    mavenPipeline()
  } else if (config.type =="frontend") {
    pipeline {
      agent any

      stages{
        stage ("Frontend Stage"){
          steps{
            script{
              echo("This is frontend pipepline")
            }
          }
        }
      }
    }
  } else {
    pipeline {
      agent any

      stages{
        stage ("Unsupported Stage"){
          steps{
            script{
              echo("Sorry elected Config is not supported")
            }
          }
        }
      }
    }
  }
}