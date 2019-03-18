package algorithmia.DemoScalaAlgorithm

import org.scalatest._

class DemoScalaAlgorithmSpec extends FlatSpec with Matchers {
  "Initial DemoScalaAlgorithm algorithm" should "return Hello plus input" in {
    val algorithm = new DemoScalaAlgorithm()
    "Hello Bob" shouldEqual algorithm.apply("Bob")
  }
}
