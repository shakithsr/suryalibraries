def newGit(jiva)
{
  git "${jiva}"
}

def newMaven()
{
  sh 'mvn package'
}

def newDeploy(jobname,ip,context)
{
  sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}
  
def newselenium(jobname)
{
  sh "java -jar /home/ubuntu/.jenkins/workspace/${jobname}/testing.jar"
}
