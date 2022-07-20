def Sgit(ram)
{
  git "${ram}"
}

def Smaven()
{
  sh 'mvn package'
}

def Sdeploy(jobname,ip,context)
{
  sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}
