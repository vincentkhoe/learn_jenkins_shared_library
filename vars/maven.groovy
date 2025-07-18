def call (String command) {
  return sh("./mvnw ${command}") 
}