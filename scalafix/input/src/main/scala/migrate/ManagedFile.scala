/*
rule = [InferTypes, ExplicitImplicits]
*/
package migrate

import buildinfo.BuildInfo

object ManagedFile {
  val string = BuildInfo.name
}
