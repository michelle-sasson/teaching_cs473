# CSC 47300: Website Design

Hello Csc 47300, Cheers to a good semester! 

This is an example project. It serves a couple purposes.

1. See how a project is structured
    - Separate modules
        - parent (helloworld)
        - api-models
        - helloworld-main
    - Package names
    - Unit tests
2. See how to build and run a project
3. What & how I expect you to submit your HW/assignments.
4. Get acquainted with the libraries, frameworks, tools, etc.

## [Spring Boot](https://spring.io/projects/spring-boot#overview)
There are so many ways to put together a Web Service. Spring is a framework which provides infrastructure support at the application level. Spring Boot is commonly used to build microservices. It also provides a way to build a web applications very quickly. 

Take a look at the [helloworld-main build.gradle file](../helloworld-main/build.gradle). You'll see we depend on `org.springframework.boot:spring-boot-starter-web`. This is a starter for building web, including RESTful, applications using Spring MVC. Uses Tomcat as the default embedded container. See what other starters spring boot provides [here](https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/reference/htmlsingle/#using-boot-starter).
    
## [Lombok](https://projectlombok.org/)
If you're not familiar w/ [annotations](https://docs.oracle.com/javase/tutorial/java/annotations/), you're probably wondering what are these funky @ signs on some of these java files. Lombok provides annotations which write a ton of boiler plate code for you. For example the `@NoArgsConstructor` annotation will add a constructor with no arguments to that class. It gets rid of a ton of lines in a class and makes it a lot easier to read as well.
    
## [Gradle](https://docs.gradle.org/current/userguide/userguide.html)
This project is built using Gradle. It's a build automation tool. It controls the development process in the tasks of compilation and packaging to testing, deployment, and publishing.

I recommend that you use the gradle wrapper (gradlew file). Instead of requiring everyone to download the same version of gradle, a project can specify a specific version of gradle to use. When executing a task with the wrapper, you're guaranteed to use the version of gradle that this project supports. This is also helpful when working on multiple projects with different versions of gradle. It doesn't matter what version you have running locally, as long as you use the wrapper.

Take a look at the tasks that are available to run for this project.
`./gradlew tasks`

## Launching the project
This project will start up Tomcat locally on port 8080.
You can run it two different ways. 

1. Terminal:
Run: `./gradlew bootRun`
2. IDE:
As a java application run the com.cs473.helloworld.HelloWorldApplication main method.

After the application starts, you'll see something like:
```
Started HelloWorldApplication in 17.116 seconds (JVM running for 17.643)
```

You can send requests to it after starting up. I have set up a [Postman Workspace](https://app.getpostman.com/join-team?invite_code=a5890d1c0b4165b6faed150ca15e2c4b&ws=8b82b292-7236-430a-946a-7c5ec65e1864) which can call the APIs.
Within the postman workspace, navigate to Collections. You'll see a HelloWorldExampleCollection.

## Submitting your HW/Projects/Assignments
Some of your assignments will require you to push your work to github. I will require a README as well as a link to your commit.
Here is an example of a link to a specific [commit](https://github.com/michelle-sasson/teaching_cs473/commit/c90576a2dabf0fafc37742c9240ff1f2d10563c4)
Here is an example of viewing the entire repository from a specific [commit](https://github.com/michelle-sasson/teaching_cs473/tree/c90576a2dabf0fafc37742c9240ff1f2d10563c4)

Commits in Git are immutable. Any change to a commit will create a new commit. When you push your commit to github, we can view the changes made in that commit and we can view the entire project up to that commit. When you submit your HW on blackboard, you will submit a link to a specific commit. That commit will be used to grade your assignment.

