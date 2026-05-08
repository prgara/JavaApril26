folder - directory

mkdir -> create a new directory


pwd -> present working directory


cd -> change directory -> move from one director to another directory
cd .. -> one step back


cp -> copy content from one file to another
cp fruits.txt veg.txt


mv -> rename/ moving the file
mv veg.txt cities.txt


rm -> remove the file
rmdir -> remove the dir
rm -r -> remove the director which is not empty


1. Open your terminal and run pwd
2. Create a folder: /myproject/src
3. Navigate into it: myproject
4. Create some files:README.md src/index.js
5. List them:
6. Add content: My First Linux Project > README.md
7. Verify it: README.md

ls -l -> details about the files and folder
Permissions    memory blocks      owner          group owner    size in bytes      created/modifies date   file name
-rw-r--r--.     1                 ec2-user        ec2-user        21                May  8 00:17           index.html

ls -a -> hidden files and folder along with normal files and folders
ls -l file* -> shopes all the files and folder starting with name file.


absolute path -> complete path from root directory
/Users/lovepreet/java_stuff/Lectures/Repos/Apr_2026/src/sideCourse/may07/readMe.md
relative path -> path relative to current working directory

root dir -> /
home dir -> ~

wc -> word count
wc fileName
num of lines        no.of words          bytes         fileName
1                    4                    21           index.html



sort fileName -> sorts the file
sort -r fileName -> sorts the file in reverse order



file  owner                group                        others
-     rw-                   r--                          r--.
folder
d     rwx                   r-x                           r-x



r - read
w - write 
x - executable


0 - no permission
1 - execute
2 - write
3 - write + execute
4 - read
5 - read + execute
6 - read + write
7 - all permission

chmod 400 -> 



