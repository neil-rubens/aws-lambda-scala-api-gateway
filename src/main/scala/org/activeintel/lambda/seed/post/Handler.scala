package org.activeintel.lambda.seed.post

import com.amazonaws.services.lambda.runtime.{Context, RequestHandler}

/**
 * Created by neil on 10/5/15.
 */
class Handler extends RequestHandler[Request,Response]{
  override def handleRequest(input: Request, context: Context): Response = {
    return new Response("hello there: " + input.firstName + " " + input.lastName )
  }
}
