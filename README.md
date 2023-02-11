<h1>Employee Portal application using Angular2-springboot</h1>
This example shows how to use angular 2 application with java 8, Spring boot with help of swagger.<br>

Here you can see following things.<br>
<p><b>Server Side<b></p>
<ul>
<li>SpringBoot</li>
<li> Maven 3+ </li>
<li> JAVA 8 </li>
<li>Spring MVC architecture</li>
<li>RestController</li>
<li>Swagger</li>
<li>Use of data jpa</li>
<li>H2 Database</li>
<li>Unit testing using junit and mockito</li>
</ul>

<p><b>Frontend side<b></p>

<ul>
<li>Angular2 Components</li>
<li> Modal </li>
<li>CRUD Functionality (Create, Read(view/display))</li>
<li>Single Page Application</li>
<li>Routing | Router outlet | Router</li>
<li>Stunning UI with bootstrap</li>
</ul>
<br>

<h1>How to Setup this project </h1>

<h2> Backend </h2>
<ul> 
<li>Maven 3+</li>
<li>Java 8 </li>
<li>Use spring initializer to use spring boot template with dependencies</li>
</ul>

<h2> Frontend </h2>
<ul>
<li>Clone project, Open cmd or Node js Command prompt</li>
<li><code>npm install -g angular-cli </code> to install angular 2 cli ( globally ) </li>
<li><code>npm install</code> to install Node packages</li>
</ul>

<h1>How to Run </h1>

<h2> Backend </h2>
<ul> 
<li><code>mvn clean install</code> to clean if exists files and install packages</li>
<li><code>mvn spring-boot:run</code>  to start spring boot</li>
</ul>

<h2> Frontend </h2>
<ul>
<li><code>ng serve --open</code> or <code>npm start</code> </li>
</ul>



<h3>Make sure backend service is up and running before start frontend</h3>

<h3>Guide to Build and Run Project</h3>
When you Import this project, You need to fulfill the requirements.

**If you have imported project in eclipse, Follow this steps to build project:**
1. Right click on project > Properties > **Java Build path**
2. Change your **JDK if 1.8 is not set.**
3. You need **Maven 3+** configured in your system (or You can download Maven 3+ from [here](https://maven.apache.org/download.cgi))
4. Once you setup with all this things,
Right click on project > Run as > Maven clean (you can directly do this using **mvn clean** command in cmd at specific project dir)
5. Again right click on project, Find **Maven >** in options, Click on **Update project**
check **Update snapshots forcefully** option and press ok.
6. Now you can refresh your project. Run clean and build project.
7. **Main Important step >** Right click on project > Run as  > **Maven Install**
 This step will install required dependency specified in [pom.xml]


**You may have question that how this was generated ?**
If you observed libraries (Dependencies) in pom.xml ,
```
<dependency>
	<groupId>com.h2database</groupId>
	<artifactId>h2</artifactId>
	<scope>runtime</scope>
</dependency>
```
You need to know more about [H2 Database](https://en.wikipedia.org/wiki/H2_(DBMS)). 
H2 is a relational database management system written in Java. It can be embedded in Java applications or run in the client-server mode.
- Very fast, open source, JDBC API
- Embedded and server modes; in-memory databases (Simple meaning => data will not persist on the disk)
- lightweight Java database
- It can be embedded in Java applications or run in the client-server mode
Whatever things (Objects, String or anything) you want to store in **H2** you can.
In this example, whatever values you want to store (CRUD operations), it will be retain in H2 Database till you shutdown your tomcat.(or other servers).

<h3>Frontend</h3>
Front end includes unit test case in jasmine, with component for employee registration amd for view employee. Routing is also implemented.
<code>server.js</code> included for production deployment.