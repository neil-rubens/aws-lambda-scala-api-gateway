package org.activeintel.lambda.seed

import com.amazonaws.services.lambda.runtime.{RequestHandler, Context}

import scala.beans.BeanProperty


class Handler extends RequestHandler[Request,Response]{
  override def handleRequest(input: Request, context: Context): Response = {
    return new Response("hello there: " + input.firstName + " " + input.lastName )
  }
}


case class Request(
                    @BeanProperty var firstName: String,
                    @BeanProperty var lastName: String
                    ){
  /**
   * Empty constructor needed by jackson (for AWS Lambda)
   * @return
   */
  def this() = this(firstName = "", lastName = "")

}

case class Response(@BeanProperty var details: String){
  /**
   * Empty constructor needed by jackson (for AWS Lambda)
   * @return
   */
  def this() = this(details = "")

}

