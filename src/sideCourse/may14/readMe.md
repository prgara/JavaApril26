grep
owner - rw group - r other - r


VCS - Version control system
It will track the changes done to a file over the time.
track, manage and control the source code.


Git is a distributed VCS -> Linus Torvalds
it is a software used locally  to track the changes in the project

Github -> website/cloud platform where you can keep your project.
Gitlab, Bitbucket


git can work w/o github. git cannot work without git.

why git ?


project_final
project_final_v1
project_v2
project_v3

problems
- changes may get overridden
- files going back and forth through email
- No history of who changed what
- difficult to go back in time
- duplicate code
- no tracking
- difficult to collaborate


Req
- History of changes 
- Team collaborate
- version backup

Git fulfills all the above requirements and we can overcome from the problems listed.

Download git and install on your machines
create an account on github.


git -v to check the git version



Git repository is project folder with memory.

git init -> initialize a git repo.

git status -> shows which files have been modified

git add fileName -> add file to staging area

git commit -m "msg" ->  captures the snapshot of the code at a particular time.

git push -> push to code to remote repository.

git log -> shows commit history
git log --oneline -> shows commit history in short version.


Working dir -> where we actually make changes on the file
Staging area -> where we collect the changes to be committed.

local repo -> add files to staging area (add) -> local commit (commit) -> remote repo (push)


imagine you have 5 files but only 3 are ready to be go to next stage.
if you commit at this stage, all 5 files will go to next stage
with staging, you will add only 3 files and then commit it.

Commit message 
bug-fixed
null pointer issue fixed in login page


create a repo on Github and then create a project on local, add 2-3 files make changes
and try to use all the git commands to push the changes to the remote repo.










