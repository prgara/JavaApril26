- Merge conflict - when 2 people change the same line of code, git gets confused what to accept.


PR ? A request to review and merge the code

pull vs fetch 

pull - fetch + merge

main
develop
release

PR flow
- developer create a feature branch
- changes done
- Push to github
- Raise PR
- Request review 
- PR approved
- Merge


Revert - Undo a commit by creating a new commit (history will be there )
Reset - Go back in time and erase a commit (history will be changed)

git revert <commit-hash>
git reset --hard <commit-hash> or git reset --hard head~1

use revert when code is pushed to remote branch
use reset when changes are in your local only

C1 -- C2 -- C3 -- C4 -- C5



What happen once code is pushed to github ? deployment

github ------------ server =-------------- pragra.com


Student.java ----- javac Student.java ----- Student.class (bytecode)


JAR (Java Archive)

Maven -> It is used to convert java code to jar. BUILD AUTOMATION TOOL


# CI/CD - Continuous integration/ Continuous delivery
It is automated workflow which will help to build, test and deploy the code.


- Jenkin
- Github Action

- CI ->  When you write the code & push to github/bitbucket/gitlab, it will get 
integrated to github. each merge will get tested and build.

- CD -> Code is ready to deploy to different environment.

# Environment
Dev
QA
UAT 
Staging
PROD 
COB - continuity of business (exact replica of prod)


IntelliJ -- github --- Build(Junit test) ----- code quality(SonarQube) ----
QA (Integration testing) ------   UAT ---- CHG req   ------ Production 


 test--- build (java classes to jar)---- docker image --- stored in registry (dockerhub)---- 
 pull docker image ----- deploy the docker image 
 

Jenkin