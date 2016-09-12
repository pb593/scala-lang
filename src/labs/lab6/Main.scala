package labs.lab6

import scala.annotation.tailrec

/**
  * Created by pb593 on 12/09/2016.
  */
object Main extends App {

  val seq = Seq(1, 2, 3)

  def remove[A](coll: Seq[A], idx: Int): Seq[A] = coll match
    {
      case Seq() => Seq()
      case head::tail => if (idx == 0) tail else head +: remove(tail, idx - 1)
    }

  println(remove(seq, 1))


  def length[T](lst: List[T]): Int = {

    @tailrec
    def helpLen[T](l: List[T], accum: Int): Int =
      l match {
        case Nil => accum
        case head :: tail => helpLen(tail, accum + 1)
      }

    helpLen(lst, 0)

  }

  println(length(List(1, 2, 3, 4)))

  // Why does this blow up?
  /*
  val arr = Array(7, 8, 9)
  println(arr)
  print(remove(arr, 0))
  */

}
