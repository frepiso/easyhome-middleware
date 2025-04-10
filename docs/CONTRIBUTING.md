# Contributing

This projects follows:
- [Conventional Commits](https://www.conventionalcommits.org/).
- [Semantic Release](https://www.npmjs.com/package/semantic-release)

## Conventional Commits

This project follows [Conventional Commits](https://www.conventionalcommits.org/).
Some examples:

- `feat: adds functionality`
- `fix(user): fixes a bug`
- `chore(ci): updates pipeline`

Common types are: `feat`, `fix`, `chore`, `docs`, `refactor`, `test`, `style`.

### Format

```bash
<tipo>[optional: scope]: <short message>

[optional: body]

[optional: message footer with references or notes as BREAKING CHANGE]
```

### Example

```bash
feat(api): add login endpoint

BREAKING CHANGE: endpoint `/auth` is removed
```

## Semantic Release

semantic-release will parse the message and, depending on the type of commit, 
increment the version as follows:

- `feat`: Will upgrade the minor version (e.g., from 1.0.0 to 1.1.0).
- `fix`: Will upgrade the patch version (e.g., from 1.0.0 to 1.0.1).
- If you have a commit of type `BREAKING CHANGE`, it will increase the major version (for example, from 1.0.0 to 2.0.0).

When the commit goes through the semantic-release process, you should see that the version of your package.json and package-lock.json has been automatically updated, 
and a new commit will have been created with the changes. 
Also, if you have a CHANGELOG.md file, this will also be updated with the release notes.
