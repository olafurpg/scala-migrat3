import $ivy.`io.get-coursier:interface:1.0.2`

import coursierapi._

Complete
  .create()
  .withInput("io.kamon:kamon-core_")
  .complete()
  .getCompletions()

  // Example how to convert sbt build resolvers to coursierapi Repository
  // val repos = resolvers.value.collect {
  //   case m: MavenRepo => coursierapi.MavenRepository.of(m.root)
  // }
