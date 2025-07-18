def call (String command) {
  return sh("./mvnw ${command}") 
}

def multiCall (List commands) {
  for (command in commands){
    sh("./mvnw ${command}")
  }
}