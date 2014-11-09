PlayFramework 2.3 (Scala): Using subprojects(including another Play application as a subproject)
=========================================
Example of how to create subprojects(modules) in PlayFramework 2.3 (Scala) with dependencies between them.

Things to pay attention to:
* **Build.sbt** in the Root project to configure modules
* Root's **conf/routes** to attach Play subproject's routes to the routing system
* Play subproject's routes in **modules/{subproject-name}/conf/{subproject-name}.routes**
* Play subproject's **build.sbt** without unnecessary information
* Play subproject's controllers and views are reside in additional subpackages {subproject-name}
* Explicitly added **Assets** controller in Play subproject
* How assests are referenced in Play subproject's **main.scala.html**
