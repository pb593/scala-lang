package labs.lab6

/**
  * Created by pb593 on 12/09/2016.
  */
object Main extends App {

  val seq = Seq(1, 2, 3)

  def remove[A](coll: Seq[A], idx: Int): Seq[A] = coll match
    {
      case Nil => Nil
      case head::tail => if (idx == 0) tail else head +: remove(tail, idx - 1)
    }

  println(remove(seq, 0))

  // Why does this blow up?
  val arr = Array(7, 8, 9)
  println(arr)
  print(remove(arr, 0))

}
