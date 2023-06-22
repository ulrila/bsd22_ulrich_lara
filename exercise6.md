# exercise6

## What is necessary to generate Maven Site documentation?
To generate Maven Site documentation, you need:

1. Maven installed on your system.
2. Configuration in the POM.xml file, including the Maven Site plugin.
3. Documentation files in a specific directory structure (e.g., "src/site").

After setting up these requirements, running the command "mvn site" will generate
the documentation in the target/site directory.
Make sure to configure plugins and provide the necessary documentation
files according to your project's needs.

## What different aspects, configurations, information, etc. are configured in site.xml or pom.xml?
site.xml:
- Configures the navigation menu structure, custom pages, and module hierarchy
of the Maven Site.

pom.xml:
- Configures the Maven Site plugin, reporting, dependencies, and site 
URL for the Maven Site documentation.

These configuration files allow you to customize the organization, 
appearance, and additional features of your Maven Site documentation.


### Pictures

![screenshot of overview page](resources\images\ex6_1.png)
![screenshot of javadoc API-help](resources\images\ex6_2.png)
![screenshot of jacoco](resources\images\ex6_3.png)
