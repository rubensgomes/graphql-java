package com.rubensgomes.graphql.web.controller;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import lombok.extern.slf4j.Slf4j;

/**
 * A simple Web controller used for GraphQL requests.
 * 
 * @author Rubens Gomes
 */
@Slf4j
@Controller
class HelloController
{

   @QueryMapping
   public String hello()
   {
      log.trace( "hello called" );
      return "Hello World";
   }

}
