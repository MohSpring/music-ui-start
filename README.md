# Migrating a simple app into java9 modular one
Jenkins is a self-contained Java-based program, ready to run out-of-the-box, with packages for Windows, Mac OS X and other Unix-like operating systems. As an extensible automation server, Jenkins can be used as a simple CI server or turned into the continuous delivery hub for any project.


### Prerequisites
download the inital state wich is master.
Using intelliJ ultimate edition(community edition is actually better).

## Migration steps
1. import the project to be migrated
2. create new packages according to the new modules schema in our case 
the packages names will be `com.github.mohSpring.common` , `com.github.mohSpring.db`, `com.github.mohSpring.ui`
3. create the projects and add the right dependencies to the `Project structure`
4. add the descriptor file to each module


