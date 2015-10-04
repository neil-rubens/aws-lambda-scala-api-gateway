package org.activeintel.lambda.seed

import com.amazonaws.services.lambda.runtime.{RequestHandler, Context}



class Handler extends RequestHandler[Request,Response]{
  override def handleRequest(input: Request, context: Context): Response = {
    return new Response("hello there " + input.firstName + " " + input.lastName )
  }
}



class Request(var firstName: String, var lastName: String) {


  def this() {
    this("EMPTY", "EMPTY")
  }

  def getFirstName() : String = {
    return firstName
  }

  def setFirstName(firstName: String) = {
    this.firstName = firstName
  }

  def getLastName() : String = {
    return lastName
  }

  def setLastName( lastName: String) = {
    this.lastName = lastName
  }
}


class Response(var greetings: String) {

  def this() {
    this("EMPTY")
  }


  def getGreetings() : String = {
    return greetings
  }

  def setGreetings( greetings: String) = {
    this.greetings = greetings
  }

}


