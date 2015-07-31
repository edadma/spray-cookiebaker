//addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")

resolvers += Resolver.url(
  "bintray-sbt-plugin-releases",
    url("http://dl.bintray.com/content/sbt/sbt-plugin-releases"))(
      Resolver.ivyStylePatterns)

addSbtPlugin( "me.lessis" % "bintray-sbt" % "0.2.1" )

addSbtPlugin("io.spray" % "sbt-revolver" % "0.7.2")