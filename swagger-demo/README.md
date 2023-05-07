# Swagger Demo
This a sample application to integrate Spring boot with Swagger.

### How to run the application
Run the docker-compose first to start the postgres DB.
Run the command ```docker-compose up -d``` from the root.

Then start the SwaggerDemoApplication. The application starts on ``http://localhost:8080``

### Swagger
Swagger UI shows four endpoints namely: GET, POST, PATCH and DELETE. With these method you can CRUD User. URL: ``http://localhost:8080/swagger-ui/index.html#/``


The project uses the following libraries to make life easier
* MapStruct (map Java bean types from one type to another)
* Lombok (to remove boilerplate code instead generate getters/setters/etc,. on compile)


## Reference
* [Spring boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
* [Spring-doc-openapi](https://springdoc.org/)
* [MapStruct](https://mapstruct.org/documentation/stable/reference/html/)
* [Lombok](https://projectlombok.org/features/)
* [Docker](https://docs.docker.com/get-started/)