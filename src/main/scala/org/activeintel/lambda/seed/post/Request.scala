package org.activeintel.lambda.seed.post

import scala.beans.BeanProperty

/**
 * Created by neil on 10/5/15.
 */
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
