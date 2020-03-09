# 贡献指导

如果您有兴趣为这个项目做出贡献使之变得更好，我们将热烈欢迎！ 以下是一系列的贡献准则

- [行为准则](#coc)
- [提交一个issue](#issue)
- [提交一个PR](#pr)

## <a name="coc"></a> 行为准则

我们采用了《行为准则》 [coc]，以保证该项目的开放性和包容性。 请阅读全文，以便您了解可被接纳的行为。

## <a name="issue"></a> 如何提交一个issue

如果您有任何问题或者功能建议，请随时提交issue。

当您提交issue之前，请参考以下准则：

- 请搜索相关issue，以确保您不会打开重复的issue。

- 请指定issue的类型，并在标题或内容中说明问题，如：功能、故障、文档、讨论、需要的帮助…该issue将由项目的机器人（Menbotics）自动标记。请参阅支持的issue标签。

为了使issue的详细尽可能标准，我们为issue报告者设置了issue模板。请确保按照说明填写模板中的字段。

在很多情况下，您可以打开一个issue：

- 故障报告

- 功能建议

- 性能问题

- 功能设计

- 需要的帮助

- 文档不完整

- 测试改进

- 关于项目的任何问题

- 等等

另外，我们必须提醒您，在填写新issue时，请记住从您的帖子中删除敏感数据。敏感数据可以是密码，密钥，网络位置，私人业务数据等。


## <a name="pr"></a> 提交一个PR

为帮助您熟悉我们贡献的过程，我们已经收集了一些相对较小的包含bug或者有特色的issue。这是迈向开始的很好的一步。

在您提交pr之前，请参考以下准则：

### 1. 提出一个issue

确定一个issue描述清楚了要解决的问题或您想添加的文档特点。

如果您决定要解决一个issue，请确认并检查评论，以防已经有人解决了这个问题。如果没有人解决这个问题，您可以留下一个以 /self-assign 为开头的评论，这样其他人不会再重复操作。项目的机器人会自动为您认领任务。

```shell
/self-assign
```
如果两周以上没有人跟进这个问题，您可以解决这个问题，但您仍应该留下一个评论。

### 2. Fork并clone 仓库

访问名为2020NCOV/ncov-report-mini-program-server 的报告，并通过forking在您的仓库中克隆。并从仓库中克隆到本地。例子如下：

```shell
# replace the XXX with your own user name
git clone git@github.com:XXX/ncov-report-mini-program-server.git
cd ncov-report-mini-program-server
```

### 3. 创建一个新分支

创建一个新的开发分支。

```shell
git checkout -b branch-name
```

分支的名字应该有明确的含义，应避免使用诸如“update“或 “tmp”这些词。 如果修改将要实现新功能，我们建议使用`feature/xxx`

### 4. 进行更改

现在，您可以创建补丁，包括在新分支中包含适当的测试用例。

### 5. 提交您的更改

如果您的更改通过了测试，您就可以提交更改。我们鼓励您使用 [angular commit-message-format][angular-commit-message-format] 来编写提交信息。这样，我们可以拥有更可追踪的历史记录和自动生成的变更日志。

```shell
git add .
git commit -m "fix: add license headers (#264)"
```

### 6. 将您的本地库与上游同步

通过以下命令更新您的本地库，使本地库与上游库保持同步：

```shell
git remote add upstream git@github.com:2020NCOV/ncov-report-mini-program-server.git
git fetch upstream master
git rebase upstream/master
```

如果发生冲突，则需要手动解决冲突，然后使用以下命令：

```shell
git add my-fix-file
git rebase --continue
```


### 7. 个人分支推送至github

```shell
git push -f origin branch-name
```

### 8. 提交PR

在github中，向项目`2020NCOV:ncov-report-mini-program-server`提交PR。

为了确保我们能容易地理解大家提出的问题，我们提供了一个【PR模板】,您只需要在此模板的基础上进行完善即可。

我们的核心团队会关注你的PR并进行审核。如果符合要求，我们会将它们合并到主分支上（或给出一些简单的修改意见），或者将其关闭并给出修改意见。

如果我们给出修改意见，那么我们会请您：

- 完成我们需求的更新。
- 重新运行测试用例，并确保测试仍能通过。
- 用“commit --amend”的方式来提交代码，并强制推送到您的github仓库（git push -f）（这也会更新你的PR）.

    ```shell
    git add .
    git commit --amend
    git push -f origin branch-name
    ```

这就足够了，感谢您的贡献！

### 9. 在您的PR被合并后
当您的PR得到合并（merge）后，您可以放心删除您用来进行修改的分支并将修改的内容提交到upstream仓库中：

- 在github网页端或者本地的git bash客户端中的命令行用如下的方式来删除远程分支：

    ```shell
    git push origin --delete branch-name
    ```

- 检查本地仓库的主分支（master）：
 
    ```shell
    git checkout master -f
    ```

- 删除本地分支：

    ```shell
    git branch -D my-fix-branch
    ```

- 用最新的upstream版本来更新本地主分支（master）：

    ```shell
    git pull --ff upstream master
    ```

[coc]: ./CODE_OF_CONDUCT.md

[new-issue]: https://github.com/2020NCOV/ncov-report-mini-program-server/issues/new

[issue-label]: https://github.com/2020NCOV/ncov-report-mini-program-server/labels

[good-first-issues]: https://github.com/2020NCOV/ncov-report-mini-program-server/issues?utf8=%E2%9C%93&q=is%3Aissue+is%3Aopen+label%3A%22good+first+issue%22+

[repo]: https://github.com/2020NCOV/ncov-report-mini-program-server

[angular-commit-message-format]: https://github.com/angular/angular.js/blob/master/DEVELOPERS.md#-git-commit-guidelines

[pr-template]: ./.github/pull_request_template.md

[issue-template]: ./.github/issue_template.md.

