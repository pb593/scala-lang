package labs.lab7

import java.io.File

/**
  * Created by pb593 on 12/09/2016.
  */
object Main extends App {

  val target = "/Users/pb593"

  // List all non-hidden files
  for(f <- new File(target).listFiles().filter(!_.isHidden())) println(f.getAbsoluteFile())

  // Gen files and dirs separately
  val dirList = new File(target) listFiles() filter(_.isDirectory)
  val fileList = new File(target) listFiles() filter(_.isFile)

  println("Files:")
  for(f <- fileList) println(" " + f.getName)

  println("Dirs:")
  for(d <- dirList) println(" " + d.getName)

  // Generate a list of (file, size) pairs
  val fileSizes = for(f <- fileList) yield (f.getName, f.length())
  for((fs, size) <- fileSizes) println(" " + fs + " " + size)

  // 10 smallest and largest
  val smallest10 = fileSizes.sortBy(_._2).slice(0, 10)
  println("Ten smallest:")
  for((fname, size) <- smallest10) println("\t" + fname + "\t" + size)

  val largest10 = fileSizes.sortBy(-_._2).slice(0, 10)
  println("Ten largest:")
  for((fname, size) <- largest10) println("\t" + fname + "\t" + size)
}
