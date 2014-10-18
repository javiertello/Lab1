# ToDo SOAP Server (web application)
This project contains a demonstration of a web service build with [JAX-WS](http://docs.oracle.com/javaee/6/tutorial/doc/bnayl.html). 

Deploy your code to a [Jetty](http://www.eclipse.org/jetty/) server with ```gradle jettyEclipseRun```. Then, open the page at [http://localhost:8081/](http://localhost:8081/). 

The service endpoint is at [http://localhost:8081/toDoSOAP](http://localhost:8081/toDoSOAP) (see [WEB-INF/sun-jaxws.xml](src/main/webapp/WEB-INF/sun-jaxws.xml) for the endpoint mapping). 

