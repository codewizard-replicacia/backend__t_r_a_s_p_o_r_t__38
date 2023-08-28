FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY pom.xml pom.xml
COPY jpa jpa
COPY backend__t_r_a_s_p_o_r_t__38 backend__t_r_a_s_p_o_r_t__38
RUN mvn clean package -DnoTest=true

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/backend__t_r_a_s_p_o_r_t__38/target/_t_r_a_s_p_o_r_t_-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar _t_r_a_s_p_o_r_t_-0.0.1-SNAPSHOT.jar"]