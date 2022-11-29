package com.rubensgomes.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A simple Spring Boot GraphQL application.
 * 
 * @author Rubens Gomes
 */
@SpringBootApplication
class GraphQLApplication
{
   public static void main( String[] args )
   {
      SpringApplication.run( GraphQLApplication.class,
                             args );
   }
}
