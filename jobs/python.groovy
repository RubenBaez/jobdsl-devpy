project_name = "jenkins-pipeline-python"
repo = "https://github.com/RubenBaez/DEVSU.git"
repo_name = "devsu"


pipelineJob(project_name){
	definition {
		triggers{
			scm('H/1 * * * *')
		}

		cpsScm{
			csm{
				git{
					remote {
						name(repo_name)
						url(repo)
					}
				}
			scriptPath("Jenkinsfile")
			}
		}
	}
}
