/* ************************************************************** *
 *                                                                *
 * Copyright (c) 2005, Kota Mizushima, All rights reserved.       *
 *                                                                *
 *                                                                *
 * This software is distributed under the modified BSD License.   *
 * ************************************************************** */
package com.github.kmizu.yapp.runtime

import java.io.IOException

object RuntimeIOException {
  private final val serialVersionUID: Long = 5846485643752619982L
}

class RuntimeIOException(val ex: IOException) extends RuntimeException {
  def getIOException: IOException = ex
}
