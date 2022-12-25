case class MCPackModel(formatVersion: Int, game: String, versionId: String, name: String, summary: String,
                       files: Array[ModModel], dependencies: DependenciesModel) {

}
case class ModModel(path: String, downloads: Array[String], hashes: ModHashModel, fileSize: Int)

case class ModHashModel(sha1: String, sha512: String)

case class DependenciesModel(minecraft: String, fabricLoader: String)