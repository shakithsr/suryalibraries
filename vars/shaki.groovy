def Sgit(ram)
{
  git "${ram}"
}

def Smaven()
{
  sh 'maven package'
}
