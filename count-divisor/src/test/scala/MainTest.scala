import org.scalatest.flatspec.AnyFlatSpec

class MainTest extends AnyFlatSpec{

  import org.scalatest.flatspec.AnyFlatSpec

  class PalindromeTest extends AnyFlatSpec {
    val obj = new Count
    //Test case pass if we use false
    it should "match" in {
      val check=obj.countDivisor(2,5,3)
      assert( 1== check)
    }
  }

}