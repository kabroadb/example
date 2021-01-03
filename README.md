# Building A Fat Jar Deployable

This application can be packaged into a fat jar with all of project's compiled
classes as well as its dependencies. Run the following command
`./mvnw clean package`. The jar will be in a directory called `target` in the
root of the project. 