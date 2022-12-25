
import com.google.gson.{Gson, JsonObject}
import java.io.File
import scala.io.Source._
import java.io._

object Main extends App{

  val jsonIterator= fromFile("pack.json").getLines()
  var json = jsonIterator.mkString("\r\n")
  val gson = new Gson()

  val pack: MCPackModel = gson.fromJson(json, classOf[MCPackModel])

  new File("generate").mkdirs
  for (file <- pack.files)
    write(file)

  def write(mod: ModModel) = {
    val filename = mod.path.substring(5)
    val pw = new PrintWriter(new File("generate/"+filename+".url.txt"))
    pw.write(mod.downloads(0))
    pw.write("\r\n")
    pw.write(mod.hashes.sha1)
    pw.close
  }
}






