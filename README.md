# **Incorporating feedback in your pull request**

###### When reviewers suggest changes in a pull request, you can automatically incorporate the changes into the pull request or open an issue to track out-of-scope suggestions.

### Applying suggested changessssss

Other people can suggest specific changes to your pull request. You can apply these suggested changes directly in a pull request if you have write access to the repository. If the pull request was created from a fork and the author allowed edits from maintainers, you can also apply suggested changes if you have write access to the upstream repository. For more information, see "Commenting on a pull request" and "Allowing changes to a pull request branch created from a fork."

To quickly incorporate more than one suggested change into a single commit, you can also apply suggested changes as a batch. Applying one suggested change or a batch of suggested changes creates a single commit on the compare branch of the pull request.

Each person who suggested a change included in the commit will be a co-author of the commit. The person who applies the suggested changes will be a co-author and the committer of the commit. For more information about the term committer in Git, see "Git Basics - Viewing the Commit History" from the Pro Git book site.

1. Under your repository name, click  Pull requests.
2. In the list of pull requests, click the pull request you'd like to apply a suggested change to.
3. Navigate to the first suggested change you'd like to apply.
   - To apply the change in its own commit, click Commit suggestion.
   - To add the suggestion to a batch of changes, click Add suggestion to batch. 
   Continue to add the suggested changes you want to include in a single commit. 
   When you've finished adding suggested changes, click Commit suggestions.
4. In the commit message field, type a short, meaningful commit message that describes the change you made to the file or files.
5. Click Commit changes.

### Re-requesting a review

You can re-request a review, for example, after you've made substantial changes to your pull request. To request a fresh review from a reviewer, in the sidebar of the Conversation tab, click the  icon.

### Opening an issue for an out-of-scope suggestion

If someone suggests changes to your pull request and the changes are out of the pull request's scope, you can open a new issue to track the feedback. For more information, see "Opening an issue from a comment."