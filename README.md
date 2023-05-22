```
git clone https://github.com/tclarke-scottlogic/git-examples.git git-examples-training
cd git-examples-training
git checkout tests
git merge master
```

>  Ah. We've called it getVersion() and they've renamed it version()
>
>  We should have discussed this before
>
>  Ah well, we'll take their change


`git merge --continue`


>  Okay, merge complete - everything should work now, right?
>
>  Ah, it didn't update my code
>
>  Ah, they've changed the value

`git commit -m "Fix post-merge" -a`

>  Wouldn't normally bother with this, but it helps to demonstrate

`git branch pre-rebase`

>  Okay, time to rebase onto master

`git rebase master`

> But I just *fixed* that!
>
> What's happened here is that it's reapplying the changes from the beginning

