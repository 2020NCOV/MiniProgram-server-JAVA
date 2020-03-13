# Git常用命令积累

收集一些常用的组合命令，欢迎大家补充！

## 导航

- [本地及远程仓库如何上游仓库保持一致](#本地及远程仓库如何与上游仓库保持一致)

## 本地及远程仓库如何与上游仓库保持一致

##### 1.查看是否已添加上游仓库

~~~
git remote -v
~~~

##### 2.添加上游仓库

~~~
git remote add upstream [upstream_url]
~~~

##### 3.获取原始仓库分支和对应的提交

~~~
git fetch upstream
~~~

##### 4.在本地实现与upstream的同步

~~~
git rebase upstream/master（master或其他分支名）
~~~

##### 5.推送自己的本地仓库到自己的远程仓库

~~~
git push
~~~

