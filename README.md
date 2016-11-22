# Java_SOAP
NET4005 Assignment 3: A Simple SOAP-based Application


Your task is to design an API and implement a service-oriented application. As
shown in Figure 1, this application should provide a set of services (S) with the
help of a set of back-end servers (N) for each service. The design should be
based on an API gateway and a client.
The sole functionality that should to be provided by the back-end servers is
to return a simple message including the service’s name and the back-end server
number. Each server should maintain statistics about the requests it served so
far.
The API gateway must be implemented as a SOAP server, its job is to receive
service requests from the clients and to forward these requests to an appropriate
back-end server. Note that the API gateway can communicate with the backend
servers using SOAP or RPC but in this assignment SOAP is required. Most
importantly, the API gateway must achieve load balancing among the different
servers. Additionally, the API gateway, should log all clients requests including
the client identification (IP and port) and shows the total number of requests
served.
Finally, your application should include one or more SOAP clients, that generate
service requests at the API end-point.
