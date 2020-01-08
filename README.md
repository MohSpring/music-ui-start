# Migrating a simple app into java9 modular one
Jenkins is a self-contained Java-based program, ready to run out-of-the-box, with packages for Windows, Mac OS X and other Unix-like operating systems. As an extensible automation server, Jenkins can be used as a simple CI server or turned into the continuous delivery hub for any project.


### Prerequisites
download the inital state wich is master.
Using intelliJ ultimate edition(community edition is actually better).

## Migration steps
1. import the project to be migrated if on java 11, you  might have to create a general module for importing javafx and create a descriptor file.
```java
module music.ui.start {
    requires javafx.graphics;
    requires javafx.base;
    requires java.sql;
    requires javafx.fxml;
    requires javafx.controls;

    exports  sample to javafx.graphics, javafx.fxml;
    opens sample to javafx.fxml;
    opens sample.model to javafx.base;
}
```
2. adding the `sqlite jar` to the project.
3. create new packages according to the new modules schema in our case 
the packages names will be `com.github.mohSpring.common` , `com.github.mohSpring.db`, `com.github.mohSpring.ui`
4. create the projects and add the right dependencies to the `Project structure`
5. add the descriptor file to each module
6. detect any optimization for common module.

    ###`descriptor files for the 3 modules`:
```java
module com.github.akramov.common {
    requires javafx.base;
    opens com.github.akramov.common to javafx.base;
    exports com.github.akramov.common;
}    
module com.github.akramov.bd {
    requires sqlite.jdbc;
    requires java.sql;
    requires transitive com.github.akramov.common;
    exports db;
}
  module com.github.akramov.controller {
      requires com.github.akramov.bd;
      requires javafx.fxml;
      requires javafx.controls;
  
      exports controller to javafx.graphics, javafx.fxml;
      opens controller to javafx.fxml;
  }
       
 ```
 # thank You .