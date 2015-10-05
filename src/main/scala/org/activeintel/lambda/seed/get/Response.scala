package org.activeintel.lambda.seed.get

import scala.beans.BeanProperty

/**
 * Created by neil on 10/5/15.
 */
case class Response(@BeanProperty var details: String){
  /**
   * Empty constructor needed by jackson (for AWS Lambda)
   * @return
   */
  def this() = this(details = "")

}
