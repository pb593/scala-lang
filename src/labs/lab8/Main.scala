package labs.lab8

/**
  * Created by pb593 on 12/09/2016.
  */
object Main extends App {

  // Ex. 1

  def op(opCode: String): (Int, Int) => Int =
    opCode match {
      case "add" => _ + _
      case "sub" => _ - _
      case "div" => _ / _
      case "mul" => _ * _
    }

  val add = op("add")
  println(add(5, 11))

  // Ex. 2

  class Client {}
  class JuniorClient extends Client {}
  class RegularClient extends Client {}
  class SeniorClient extends Client {}

  def allowedToBorrow(c: Client) =
    c match {
      case _: JuniorClient => 5
      case _: RegularClient => 10
      case _: SeniorClient => 15
    }




}
