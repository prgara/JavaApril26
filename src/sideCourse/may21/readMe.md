- develop new features
- fix bugs
- release new code safely
- w/o breaking the production

Branch -> independent line of development, separate workspace from the existing code.
Branch is just a pointer.

Branching strategy defines rules and convention your team follows, which branch exist, 
how long and how code will flow.


# 3 branching strategy

v26

v27

5 features
5 developers

develop - v26 ---- create feature ------ features is completed-- merge back to develop -- v27
release - v26
main - v26


develop --- realease/v27 --- regression testing will start by QA ---- prod  v27 
back merge - merge release branch to main branch --- v27



v0.0         v0.0        v1           v1          v1            v1  
main --- develop --- features ---- develop --- realease/v1 ---- prod

v1           v2
develop--- features ---- develop --- realease/v1 ---- prod



prod v2 --- bug 
develop v3   
release v3  --- regression testing 
main  v2  --- hotfix branch ----


git branch branchName -> create a new branch
git branch -> show all the branches 
git checkout branchName -> checkout/move to the branch

- clone the repo - git clone https://github.com/prgara/Git_Apr/
- open the project in your local
- create a feature branch with your name from main branch
- make some changes in your feature branch 
- push the code to the remote


git -- vcs local  cmd line tool
github -- 














