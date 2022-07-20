def newGit(jiva)
{
  git "${jiva}"
}

def newMaven()
{
  sh 'mvn package'
}
