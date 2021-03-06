package io.jiren.ondemand

import java.nio.ByteBuffer

/** Loads an asset file.
  * @author Sino
  */
trait AssetLoader {
  def load(archive: Int, file: Int): ByteBuffer
}
